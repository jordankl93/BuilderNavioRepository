# Builder Navio

## Padrão Builder

O padrão de projeto builder separar a construção de um objeto complexo de sua representação de modo que o mesmo processo de
construção possa criar diferentes representações.  Em outras palavras, nesse padrão, assim como os padrões fábrica abstrata e método fábrica, visa  separar a construção da representação, porém o padrão builder permite separar os passos da contrução do objeto.

Em nosso caso o builder foi utilizado para separar a população de um navio com suas cargas e passaegeiros. Com isso criamos dois builders, uma para os navios de carga que possuem carga e passageiros, e outro para construir navios de passageiros, esses por sua vez só levandos passageiros. Veja abaixo como ficou o diagrama de classes do projeto.

## Diagrama de Classe
