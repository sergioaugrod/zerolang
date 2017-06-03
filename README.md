# Zerolang

Creating a language with ANTLR4 and Kotlin.

#### Generate Parser

The `ZerolangLexer`, `ZerolangParser`, `ZerolangBaseListener`, `ZerolangListener`, and `Zerolang.tokens` files were automatically generated based on the Zerolang.g4 grammar by the following command:

```bash
$ antlr4 Zerolang.g4
```

#### Test

```bash
$ grun Zerolang program -tree
$ grun Zerolang program -gui
```
