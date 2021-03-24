## Kata de refactorización de tenis
Imagine que trabaja para una empresa de consultoría, y uno de sus colegas ha estado trabajando para la Sociedad de Tenis. El contrato es por 10 horas de trabajo facturable, y su colega ha pasado 8.5 horas trabajando en él. Lamentablemente, ahora ha caído enfermo. Él dice que ha completado el trabajo, y todas las pruebas pasan. Tu jefe te ha pedido que te hagas cargo de él. Quiere que pases una hora más o menos en el código para poder facturar al cliente las 10 horas completas. Ella le indica que arregle un poco el código y tal vez tome algunas notas para que pueda darle a su colega algunos comentarios sobre el diseño elegido. También debe prepararse para hablar con su jefe sobre el valor de este trabajo de refactorización, más allá de las horas adicionales facturables.



Hay tres versiones de esta kata refactorizadora, cada una con sus propios olores y desafíos de diseño. Le sugiero que comience con el primero, con la clase "TennisGame1". El conjunto de pruebas proporcionado es bastante completo y rápido de ejecutar. No debería necesitar cambiar las pruebas, solo ejecutarlas a menudo mientras refactoriza.



Si te gusta este Kata, puede que te interese mi libro, "The Coding Dojo Handbook"



## Tenis kata
El tenis tiene un sistema de puntuación bastante peculiar, y para los recién llegados puede ser un poco difícil de seguir. La sociedad del tenis te ha contratado para construir un marcador para mostrar el puntaje actual durante los juegos de tenis.



Su tarea es escribir una clase "TennisGame" que contenga la lógica que genera el puntaje correcto como una cadena para mostrar en el marcador. Cuando un jugador anota un punto, se activa un método para llamar a su clase que le permite saber quién anotó el punto. Más tarde, recibirá una llamada "score()" desde el marcador preguntando qué debe mostrar. Este método debería devolver una cadena con la puntuación actual.



Puede leer más sobre los puntajes de tenis aquí, que se resume a continuación:



El primer jugador que gana un juego gana al menos cuatro puntos en total y al menos dos puntos más que el oponente.

El puntaje de cada juego se describe de una manera peculiar al tenis: los puntajes de cero a tres puntos se describen como "Love", "Fifteen", "Thirty", y "Forty" respectivamente.

Si cada jugador ha obtenido al menos tres puntos y los puntajes son iguales, el puntaje es "Deuce".

Si se han anotado al menos tres puntos por cada lado y un jugador tiene un punto más que su oponente, el puntaje del juego es "Advantage" para el jugador que lidera.

Solo necesitas informar el puntaje del juego actual. Los conjuntos y las coincidencias están fuera de alcance.



### Preguntas para discutir después
- ¿Cómo se sintió trabajar con pruebas tan rápidas y completas?

- ¿Cometiste errores al refactorizar que fueron detectados por las pruebas?

- Si utilizó una herramienta para registrar sus ejecuciones de prueba, revísela. ¿Podrías haber tomado pasos más pequeños? ¿Cometió menos errores de refactorización?

- ¿Alguna vez cometió algún error de refactorización y luego retiró sus cambios? ¿Cómo se sintió tirar el código?

- ¿Qué le dirías a tu colega si hubiera escrito este código?

- ¿Qué le dirías a tu jefe sobre el valor de este trabajo de refactorización? ¿Hubo más razones para hacerlo más allá de la hora extra facturable?