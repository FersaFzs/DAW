####################
## Fersa           #
# Aprendizaje de R #
# 21/11/2024       #
####################

rm(list = ls())


# insertar librería -------------------------------------------------------


library(rstudioapi)
#rstudioapi::versionInfo()


# Código ------------------------------------------------------------------

# Declaración de variables
a <- 2
b <- 3

# Operadores
a+b
a-b
a*b
a/b
b%%a
b%/%a
a^b
sqrt(b)
is.na(a)
NA
c <- NA
is.na(c)
NULL
is.null(a)
is.null(NULL)
!a
d <- 0
!d
d

# Tipos

typeof(a)
typeof("a")
typeof(integer(1))
typeof(1)
as.logical(1)
as.numeric("1.32")

# Vectores

v <- c(1,2,3,4)
v
v[1]
v[4]
v[2:4]

v2 <- 10:1
v2
order(v2)
v2[order(v2)]
v2[v]
v2 + v
v2+v
v3 <- seq(-18,0,2)
length(v3)
length(v2)
length(v2)==length(v3)

v2+v3
v3 -v2
v2*v3
v2^v3

# Matrix

m1 <- matrix(1:9, nrow = 3, ncol = 3)
m1
m2 <- matrix(2, nrow = 3, ncol = 3)
m2
m1+m2
m1*m2
m1[,1] #columna
m1[1,] #fila

# Dataframe

df1 <- data.frame(m1)
df1
names(df1) <- c("Altura", "Peso", "Medida_pie")
df1$Altura
df1[,1]
df1[1,]
rownames(df1) <- c("Pedro", "María", "Eva")
rownames(df1) <- NULL
 df1[3:1,]
df1[,"Altura"]
df1["Altura"]  

# Dónde estoy - working directory

getwd()

setwd("")...

path <- "C:/Users/Jose María Fernández/Desktop/DAW/DAW/Entornos Desarrollo/R/"

paste("Hola", "mundo", sep = "_")
paste0("Hola","mundo")

# Help
?read.csv
??sequen # curiosidad

write.csv(df1, paste0(path, "datos_R.csv"), row.names = FALSE)
