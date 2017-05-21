class MyListener : ZerolangBaseListener() {
    val variables : MutableMap<String, Int?> = mutableMapOf()

    override fun exitAssign(ctx: ZerolangParser.AssignContext) {
        val variableName = ctx.ID(0).text

        if(ctx.ID().size > 1)
            variables.put(variableName, variables[ctx.ID(1).text])
        else
            variables.put(variableName, Integer.parseInt(ctx.NUMBER().text))
    }

    override fun exitPrint(ctx: ZerolangParser.PrintContext) {
        val output = if (ctx.ID() == null)  ctx.NUMBER().text else variables[ctx.ID().text]
        System.out.println(output)
    }
}