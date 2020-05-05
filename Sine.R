server <- function(input, output) {
  output$Sine <- renderText({
    input$title
  })
  output$Sine <- renderText({
    round(sin(input$num*(pi/180)), digits = 4)
  })
}

ui <- fluidPage(
  input <- numericInput(inputId = "num",
                        label = "Pick a degree from 0 to 360", 
                        value = 1, min = 0, max = 360),
  submitButton("Update View", icon("refresh")),
  helpText("When you click the button above, you should see",
           "the output below, a slider, that lands on the sine of the value",
           "entered at the top:"),
  sinText <- "The sine of the value is: ",
  textOutput(outputId = "sinText"),
  textOutput(outputId = "Sine"),
)

shinyApp(ui, server)