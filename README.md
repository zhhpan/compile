# ANTLR4 Grammar for Drawing DSL

## Overview

This ANTLR4 grammar defines a Domain Specific Language (DSL) for drawing. The DSL allows users to create drawings by specifying various operations such as setting the origin, scaling, rotating, and using iterative for-loops to draw shapes.

## Features

- **Origin Setting**: Set the origin with the `ORIGIN` keyword.
- **Scale Setting**: Set the scaling factor with the `SCALE` keyword.
- **Rotation Setting**: Set the rotation angle with the `ROT` keyword.
- **For Loop**: Use the `FOR` keyword to create iterative for-loops for drawing shapes.
- **Expressions**: Define mathematical expressions using basic arithmetic operations, constants (`PI` and `E`), and various mathematical functions.

## Grammar Structure

The grammar is divided into several rules:

- **prog**: Represents the overall structure of a drawing program, consisting of multiple statements.
- **stat**: Defines different types of statements, such as origin, scale, rotation, and for-loops.
- **expr**: Represents mathematical expressions used in various statements.
- **expr1**: A variation of the expression rule used in specific contexts.

## Statements

1. **Origin Setting**:

   ```
   bashCopy code
   ORIGIN IS (expr, expr)
   ```

2. **Scale Setting**:

   ```
   bashCopy code
   SCALE IS (expr, expr)
   ```

3. **Rotation Setting**:

   ```
   bashCopy code
   ROT IS expr
   ```

4. **For Loop**:

   ```
   bashCopy code
   FOR T FROM expr TO expr STEP expr DRAW (expr1, expr1)
   ```

## Mathematical Expressions

Expressions support basic arithmetic operations, constants, variables, and various mathematical functions such as `SIN`, `COS`, `TAN`, `LN`, `EXP`, and `SQRT`.

## Constants

- `PI`: Represents the mathematical constant pi.
- `E`: Represents the mathematical constant e.

## Example

A simple example of a drawing program:

```
vbnetCopy codeORIGIN IS (0, 0);
SCALE IS (2, 2);
ROT IS PI;
FOR T FROM 0 TO 2*PI STEP PI/4 DRAW (T, SIN(T));
```

This program sets the origin, scales the drawing, rotates it, and then uses a for-loop to draw a sine wave.

## Comments

Single-line and multi-line comments are supported using `//`, `--`, `/*`, and `*/`.

## How to Use

1. Install ANTLR4: Follow the ANTLR4 installation instructions for your platform.
2. Generate Lexer and Parser: Use ANTLR4 to generate the lexer and parser classes from your grammar file.
3. Integrate with Your Project: Include the generated lexer and parser classes in your project.
4. Parse Input: Use the generated parser to parse input programs written in the drawing DSL.
