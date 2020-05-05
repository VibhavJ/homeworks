library(shiny)
library(ggplot2)
library(shinydashboard)
ui <- dashboardPage(
  dashboardHeader(),
  dashboardSidebar(inputOne <- sliderInput("sliderA","A", min=1, max=3, step=0.5, value=1),
                   inputTwo <- sliderInput("sliderK","K", min=1, max=5, step=0.5, value=1)),
  dashboardBody(
    fluidRow(column(6,plotOutput('waveplot')))
  ))

server <- function(input, output, session) { 
  output$waveplot <- renderPlot({
    x <- seq(0,10,0.1)
    yfxn <- function(x) { input$sliderA*sin(input$sliderK*x) }
    y <- yfxn(x)
    df <- data.frame(x,y)
    ggplot(df,aes_string(x=x,y=y))+geom_point(size=2)+geom_line()+ 
      scale_x_continuous()
  })
}

shinyApp(ui, server)