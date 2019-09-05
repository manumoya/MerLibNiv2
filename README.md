# Ejercicio MeLi Nivel 2 (Agosto 2019)
###### Autor: [Manuel Moya - mmoyam@gmail.com]
El objetivo de este documento es detallar la resolución del caso MeLi Nivel 2, donde se debe crear una api y desplegarlo en un servicio Cloud. Esto basado en el algortimo que detecta mutantes basados su secuencia de ADN del ejercicio anterior [(Nivel 1](https://github.com/manumoya/MerLibNiv1/).

### Enunciado

* Crear una API REST, hostear esa API en un cloud computing libre (Google App Engine,Amazon AWS, etc), crear el servicio “/mutant/” en donde se pueda detectar si un humano esmutante enviando la secuencia de ADN mediante un HTTP POST con un Json el cual tenga el siguiente formato:

	**POST → /mutant/**
	
	**{
	“dna”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
	}**

* En caso de verificar un mutante, debería devolver un HTTP 200-OK, en caso contrario un 403-Forbidden

### Entregables

* Código Fuente en repositorio github.
* Instrucciones de cómo ejecutar el programa o la API. 
* URL de la API.

### Idea principal

* Crear api con java Jersey 2.0.
* Utilizar servidor linux con Apache web server.
* Utilizar servicios azure (cuenta estudiante).

### Supuestos
* bla bla

### Descripción del programa

El programa considera los siguientes Packages

* **com.merlib.models**: Contiene los java beans utilizados.
* **com.merlib.process**: Contiene los programas que tienen algun proceso de negocio.
* **com.merlib.services**: Contiene los programas que habilitan las api /mutant/.

Los programas son los siguientes:

* **com.merlib.models**: 
	* Respuesta.java
* **com.merlib.process**: 
	* Mutant.java
* **com.merlib.services**: 
	* Mutante.java

Las pruebas unitarias se encuentran en el archivo [MutantTest.java](https://github.com/manumoya/MerLibNiv2/tree/master/src/test/java/com/merlib/process/MutantTest.java).


### Tecnología utilizada
* java 7.*
* Jersey 2.* (api framework)
* Junit 4.*
* Azure App Service
* Apache Tomacat 8.*
* Linux Server
* Deploy basado en GitHub
* Postman (request client)
* Apache Jmeter 3.* (Pruebas de carga)

### Traza
Los casos probados fueron los mismos casos de Nivel 1. Algunas de las trazas:

|Caso 1 = true | Caso 4 = true |
|---|---|
| ![](img/traza_caso1.png) | ![](img/traza_caso4.png) | 
| Caso 10 = false | Caso 11 = false |  
|![](img/traza_caso10.png) | ![](img/traza_caso11.png) |
|Caso 13 = true | Caso 16 = true | 
|![](img/traza_caso13.png) | ![](img/traza_caso16.png) | 
 

### ¿Se puede mejorar?

Se puede mejorar, por ejemplo agregando Swagger para la documentación e la API

### Ejecución del programa

* La url de la API es: [merlibniv2app2.azurewebsites.net](https://merlibniv2app2.azurewebsites.net/)
* Path API: /api/mutant/
* Método: POST
* Consideraciones de llamado
	* En el header Content-Type= application/jsonº