Hola Lendy te genero este proyecto rapido con un ejemplo funcional
de como podria quedar la implementacion rapida para que generes 
el token de forma rapida / segura y sin mucha complicaciones.

Forma de ejecutar /  probar el proyecto puede ser:

* Puedes entrar a la clase 'main' llamada src/main/java/com.example.uuidDemo/TestToken.java, 
  en esta clase tienes la clase principal donde ya viene el uso directo del servicio creado para la
  generacion del token, si la corres no es mas que solo un click derecho y 'Run'
  eso te imprimira el token listo para ser guardado en la BD.
  
* Puedes entrar al folder test/java/com.example.uuidDemo/TokenGeneratorSvcTests.java
  estos son los JUnits para el servicio generado, para correr los test nada mas tienes
  que darle click derecho y run 'TokenGeneratorSvcTests' en este momento solo agregue
  esos 2 tests si quieres puedes agregarle mas tests pero no creo que sea necesario
  pero es tu decision
  
Como puedes darte cuenta donde podrias enfocarte seria solo en la interface (TokenGeneratorSvc) asi como su
implementacion (TokenGeneratorSvcImpl) y de hecho podrias hacer literal un copy / paste de estas clases y
seria mas que suficiente pero todo lo demas es como deberia de ser, donde incluyes pruebas, haces uso de
dependencias (Maven), este es un proyecto Maven hecho usando SpringBoot aunque eso es solamente
algo extra como te comento tu foco son las 2 clases que te menciono, hechale un ojo y me dices ;)

Este proyecto fue generado usando Java 11 para que lo tengas en cuenta.