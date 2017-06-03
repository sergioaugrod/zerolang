class MyListener : ZerolangBaseListener() {
    val variables : MutableMap<String, Int?> = mutableMapOf()

    override fun exitAssign(ctx: ZerolangParser.AssignContext) {
        val variableName = ctx.ID(0).text
        val variableValue = Integer.parseInt(ctx.NUMBER().text)

        variables.put(variableName, variableValue)
    }

    override fun exitPrint(ctx: ZerolangParser.PrintContext) {
        val output = if (ctx.ID() == null)  ctx.NUMBER().text else variables[ctx.ID().text]
        println(output)
    }
}