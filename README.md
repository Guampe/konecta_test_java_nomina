# Sistema de Gestión de Fechas de Pago

Este proyecto implementa un sistema de gestión de fechas de pago para complementar una aplicación de nómina, 
utilizando Java y siguiendo los principios de la arquitectura limpia.
CAPA DE DOMINIO, CAPA DE APLICACIÓN Y CAPA DE INFRASTRUCTURA
No se aplica un modelo MVC ya que el sistema solicitado carece de Vista. Se crear un acople simple por medio de Puerto.

## Introducción

El sistema tiene como objetivo calcular y gestionar las fechas de pago de la nómina en una empresa, asegurando que 
se respeten las reglas de negocio establecidas y considerando los días festivos en Colombia.

## Requisitos Previos

- Java JDK 8 o superior instalado
- IDE compatible con Java (Usado original - IntelliJ IDEA)
- Conexión a Internet obliogatoria para descargar dependencias

## Instalación

1. Solo es necesario Clonae el repositorio desde GitHub ya que se trata de un sistem simple de ejecución

## Uso

1. Ejecuta la clase `Main.java` para ver un ejemplo de cálculo de próxima fecha de pago.
   
2. Modifica los parámetros de entrada en `Main.java` según necesites para probar diferentes fechas.

3. Observa la salida en la consola para verificar función, en este caso, la próxima fecha de pago calculada.

## Estructura del Sistema

El sistema está estructurado de la siguiente manera:

src/
├── domain/
│   ├── FechaPago.java
│   └── Festivos.java
├── application/
│   └── FechaPagoService.java
├── infrastructure/
│   └── Main.java
└── ports/
    └── FechaPagoRepository.java



Dominio:
FechaPago.java: Clase que representa la fecha de pago.
Festivos.java: Clase que contiene los festivos y un método para verificar si una fecha es feriado.

Puertos:
FechaPagoRepository.java: Interfaz que define el método esNoHabil para verificar si una fecha es no hábil.

Aplicación:
FechaPagoService.java: Implementa FechaPagoRepository y contiene la lógica para calcular la próxima fecha de pago.

Infraestructura:
Main.java: Clase principal que recibe la fecha de entrada y utiliza FechaPagoService para calcular la próxima fecha de pago.


Gracias a ls estructura limpia, se puede extender fácilmente el programa, añadir nuevas funcionalidades, 
cambiar la fuente de los festivos (por ejemplo, desde una base de datos) y mantener el código organizado y fácil de mantener.


CONTEXTO GENERAL DEL SISTEMA

Definición de festivos: En el conjunto FERIADOS, agrega todas las fechas de los festivos colombianos para el año en cuestión.
Método principal (main): Lee una fecha de entrada y llama al método calcularProximaFechaPago para obtener la próxima fecha de pago.
Método calcularProximaFechaPago: Determina si la fecha de pago debe ser el 15 o el 30 del mes.
Ajusta la fecha de pago al último día del mes si el día 30 no existe.
Verifica si la fecha de pago es no hábil (fin de semana o festivo) y ajusta al día hábil anterior.
Si la fecha de pago calculada ya ha pasado, ajusta al siguiente periodo de pago.
Método esNoHabil: Comprueba si una fecha cae en un fin de semana o un festivo.


### Comandos git utilizados para subir los proyectos al repositorio remoto.

git init para inicializar mi repositorio en local

git add para añadir archivos específicos o todos los archivos modificados al área de staging para prepararlos para el siguiente commit

git commit -m "Mensaje del mi commit"  Confirmo los cambios preparados en el área de staging con un mensaje explicativo

git remote add origin https://github.com/Guampe...   para inicializar y conectar con mi repositorio público en github

git push origin nombre-rama-o-branch   para enviar cambios. En este caso a la rama main ya que soy el único trabajando en el proyecto

En este caso no ha sido necesario clonar, solicitar pull, hacer merge, crear o cambiar entre ramas ya que se trabajo sobre el mismo init local.





