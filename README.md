# meli-morse-translator
Entrega MorseTranslator - MeLi

13-12-2019

Nota:
Tuve complicaciones a la hora de desarrollar el traductor Morse teniendo en cuenta la variable de la frecuencia, así como también con la 
decodificación de bits a código Morse, no llegue a una solución viable. Por lo que decidí enfocarme en el diseño de la API y el host de la
misma en una nube pública, tomando como premisa principal el segundo punto que especificaba la traducción a lenguaje humano y visceversa.

Utilicé Heroku como plataforma para hostear la API.

Utilicé Swagger-UI para tener una mejor experiencia al momento de probar la API. Dentro de la UI se hace mucho mas intereactiva el test de los servicios. URL -----> https://morse-meli-2019.herokuapp.com/swagger-ui.html#


El servicio TextTranslator, traduce de código Morse a texto. Es necesario dejar un espacio(" ") entre letras codificadas y 
un doble espacio("  ") entre palabras. Ej: .... --- .-.. .-  -- . .-.. ..
URL     ---> https://morse-meli-2019.herokuapp.com/api/morse-translator/morse-to-text/{morse}
URL Ej. ---> https://morse-meli-2019.herokuapp.com/api/morse-translator/morse-to-text/....%20---%20.-..%20%20.-%20--%20.%20.-..%20..


El servicio MorseTranslator, traduce de texto a código Morse
URL     ---> https://morse-meli-2019.herokuapp.com/api/morse-translator/text-to-morse/{text}
URL Ej. ---> https://morse-meli-2019.herokuapp.com/api/morse-translator/text-to-morse/hola%20meli


Gastón Rodriguez.
