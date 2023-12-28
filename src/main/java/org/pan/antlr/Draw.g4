grammar Draw;
@members {
    double piValue = 3.14159;
    double eValue = 2.71828;
}
prog : stat* EOF; //一个程序由多个语句构成    *代表零个或多个

stat: origin SEMI //设置偏移量
    | scale  SEMI //设置缩放比例
    | rot    SEMI //设置旋转角度
    | for    SEMI //设计for语句
    ;
origin: ORIGIN IS LPAREN lhs = expr COMMA rhs = expr RPAREN;
scale: SCALE IS LPAREN lhs = expr COMMA rhs = expr RPAREN;
rot: ROT IS expr ;
for: FOR T FROM start_point = expr TO end_point = expr STEP step_size = expr DRAW LPAREN horizontal_coordinate = expr1 COMMA vertical_coordinates = expr1 RPAREN;
expr: <assoc=right>lhs = expr op = T__2 rhs = expr #Power
    | (op = ADD|op = SUB) expr #Posandneg
    | lhs = expr (op = MUL|op = DIV) rhs = expr  #MultDiv
    | lhs = expr (op = SUB|op = ADD) rhs = expr  #Div
    | CONST_ID  #Const
    | op =(SIN|COS|TAN|LN|EXP|SQRT) LPAREN expr RPAREN  #Func
    | LPAREN expr RPAREN #Brackets
    ;
expr1: <assoc=right>lhs = expr1 op = T__2 rhs = expr1 #Power1
    | (op = ADD|op = SUB) expr1 #Posandneg1
    | lhs = expr1 (op = MUL|op = DIV) rhs = expr1  #MultDiv1
    | lhs = expr1 (op = SUB|op = ADD) rhs = expr1  #Div1
    | CONST_ID  #Const1
    | T         #Variable1
    | op = (SIN|COS|TAN|LN|EXP|SQRT) LPAREN expr1 RPAREN  #Func1
    | LPAREN expr1 RPAREN #Brackets1
    ;
fragment DIGIT : [0-9];
CONST_ID: (DIGIT+ ('.' DIGIT*)?)
        |PI{ setText(Double.toString(piValue)); }
        |E{ setText(Double.toString(eValue)); };
PI :[Pp][iI];
E: [Ee];
SIN: [Ss][Ii][nN];
COS: [cC][Oo][Ss];
TAN: [Tt][Aa][Nn];
LN: [lL][Nn];
EXP: [Ee][Xx][Pp];
SQRT: [Ss][Qq][Rr][Tt];
ORIGIN: [Oo][Rr][Ii][Gg][Ii][Nn];
SCALE: [Ss][cC][Aa][lL][eE];
T: [Tt];
DRAW: [Dd][Rr][Aa][Ww];
STEP: [sS][Tt][Ee][Pp];
TO: [tT][Oo];
FROM: [Ff][Rr][Oo][mM];
FOR: [Ff][oO][Rr];
ROT: [Rr][Oo][tT];
IS : [Ii][Ss];
WS : [ \t\r\n]+ -> skip;
//单行注释
SL_COMMENT1 : '//' .*? '\n' ->skip;
SL_COMMENT2 : '--' .*? '\n' ->skip;
//多行注释
ML_COMMENT1 : '/*' .*? '*/' ->skip;
SEMI : ';' ;
LPAREN : '(' ;
COMMA : ',' ;
RPAREN : ')' ;
T__2 : '**' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

