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

# Declaración de variables ------------------------------------------------

a <- 2
b <- 3

# Operadores --------------------------------------------------------------

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

# Tipos -------------------------------------------------------------------

typeof(a)
typeof("a")
typeof(integer(1))
typeof(1)
as.logical(1)
as.numeric("1.32")

# Vectores ----------------------------------------------------------------

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


# Condicionales y bucles --------------------------------------------------

d = 0
if(d==0){
  print("d es 0")
}else{
  print("d es distinto de 0")
}

for(i in 1:10){
  print(i)
}

i <- 10
while(i>0){
  print(i)
  i = i -1;
}


# Funciones ---------------------------------------------------------------

comprobador_0 <- function(num){
  if(num==0){
    print(paste(num, " es 0"))
  } else {
    print(paste(num, " es distinto de 0"))
  }
}

comprobador_0(15)

iterador_rango <- function(ini, fin){
  for(i in ini:fin){
    comprobador_0(i)
  }
}

iterador_rango(0, 5)

# Matrix ------------------------------------------------------------------

m1 <- matrix(1:9, nrow = 3, ncol = 3)
m1
m2 <- matrix(2, nrow = 3, ncol = 3)
m2
m1+m2
m1*m2
m1[,1] #columna
m1[1,] #fila



# Dataframe ---------------------------------------------------------------

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

df_alumnos <- data.frame(Nombre=c("Iván", "Javi", "Lara", "Ríos"),
                         Sexo=factor(c("H", "H","H","H"), c("H", "M")),
                         Nota=c(10.0, 9.7, 9.8, 6.4))
df_alumnos
str(df_alumnos)
summary(df_alumnos)


# Iris --------------------------------------------------------------------

# https://rpubs.com/MrCristianrl/502285

library(ISLR)
library(ggplot2)
library(caTools)
library(class)

df <- iris
str(df)

any(is.na(df))

ggplot(df, aes(Sepal.Width, Sepal.Length)) +
  geom_point(aes(col=Petal.Width, 
                 size=Petal.Length,
                 shape = Species)) +
  ggtitle("Longitud y anchura del sepalo según la especie") +
  labs(x="Anchura del sépalo", 
       y="Longitud del sépalo", 
       col="Especie")

ggplot(df, aes(Sepal.Width, Sepal.Length)) +
  geom_point(aes(col=Species), size=3) +
  ggtitle("Longitud y anchura del sepalo según la especie") +
  labs(x="Anchura del sépalo", 
       y="Longitud del sépalo", 
       col="Especie")+
  theme_minimal()

ggsave(paste0(path, "sepalo.png"),
       width = 8, height = 6, bg = "white")

ggplot(df, aes(Petal.Width, Petal.Length)) +
  geom_point(aes(col=Species), size=3) +
  ggtitle("Longitud y anchura del pétalo según la especie") +
  labs(x="Anchura del pétalo", 
       y="Longitud del pétalo", 
       col="Especie")+
  theme_minimal()

ggsave(paste0(path, "petalo.png"),
       width =8, height = 6, bg = "white")

ggplot(df, aes(y=Petal.Width)) +
  geom_boxplot(aes(fill=Species)) +
  theme_minimal() +
  ggtitle("Diagrama de cajas para el pétalo")

df.numeric <- df[,1:4]
specie <- df[,5]
df.scaled <- data.frame(scale(df.numeric))
sapply(df.scaled, var)
sapply(df.scaled, mean)

df.final <-  cbind(df.scaled, specie)
sample <- sample.split(df.final$specie, SplitRatio = .70)
train.data <- subset(df.final, sample==TRUE) 
test.data <- subset(df.final, sample==FALSE)

predicted.species<- knn(train.data[1:4],
                         test.data[1:4],
                         train.data[,5],
                         k=1)
head(predicted.species)

sum(test.data[,5]==predicted.species) / dim(test.data)[1]


# Dónde estoy - working directory -----------------------------------------

getwd()

setwd("")...

path <- "C:/Users/Jose María Fernández/Desktop/DAW/DAW/Entornos Desarrollo/R/"

paste("Hola", "mundo", sep = "_")
paste0("Hola","mundo")

# Help
?read.csv
??sequen # curiosidad

write.csv(df1, paste0(path, "datos_R.csv"), row.names = FALSE)
