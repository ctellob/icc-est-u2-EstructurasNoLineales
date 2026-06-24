# Informe de Práctica: Estructuras No Lineales (Árboles Binarios)

**Estudiante:** Carlos Tello
**Materia:** Estructura de Datos
**Fecha:** 23 de Junio de 2026


## Objetivo General
Aplicar los conceptos de Árboles Binarios y Árboles Binarios de Búsqueda mediante la implementación de algoritmos en Java. 
Se busca resolver problemas específicos de inserción, inversión de estructura, recorrido por niveles y cálculo de profundidad, utilizando la recursividad como herramienta principal.

## Desarrollo de los Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda
* **Objetivo:** Crear un árbol donde los datos se organicen automáticamente según su valor.
* **Lógica:** Implementamos un algoritmo que toma cada número de un arreglo y lo compara con la raíz. Si el número es menor, viaja por la rama izquierda; si es mayor, viaja por la derecha, buscando un espacio vacío para colocarse.
* **Métodos utilizados:** Se creó el método `insert(int[] numeros)` dentro de la clase, el cual se apoya en un método recursivo `add` para acomodar los nodos.
* **Pruebas y Resultados:** Se probó enviando el arreglo `{ 5, 3, 7, 2, 4, 6, 8 }`. El resultado en consola demostró que el árbol se construyó perfectamente, con el 5 como raíz, los menores a su izquierda y mayores a su derecha.

**Estructura del Código:**
![Estructura Ejercicio 1](src/img/imgEjercicio1.png)
**Resultado en Consola:**
![Consola Ejercicio 1](src/img/Ejercicio1Consola.png)

### Ejercicio 02: Invertir un Árbol Binario
* **Objetivo:** Lograr invertir un árbol ya construido.
* **Lógica:** Recorrimos el árbol nodo por nodo. En cada nodo visitado, tomamos a su hijo izquierdo y lo intercambiamos de lugar con su hijo derecho, usando una variable temporal. Al aplicar esto recursivamente en todo el árbol, este queda completamente invertido.
* **Métodos utilizados:** Se usó el método `invertTree(Node root)` el cual delega el trabajo de intercambio al método auxiliar `invertTreeRecursivo`.
* **Pruebas y Resultados:** Utilizamos el árbol generado en el Ejercicio 1. Al ejecutar la prueba, la consola imprimió primero el árbol original y luego el árbol modificado, confirmando que todos los nodos derechos pasaron a la izquierda y viceversa.

**Estructura del Código:**
![Estructura Ejercicio 2](src/img/Ejercicio2Estructura.png)

**Resultado en Consola:**
![Consola Ejercicio 2](src/img/Ejercicio2Consola.png)


### Ejercicio 03: Listar Niveles en Listas Enlazadas
* **Objetivo:** Recorrer el árbol agrupando los nodos que se encuentran en el mismo nivel.
* **Lógica:** Comparamos el árbol, al ir bajando por cada rama, llevamos el conteo del nivel actual. Si descubrimos un nivel nuevo, creamos una lista enlazada vacía para ese piso y guardamos ahí el nodo. 
* **Métodos utilizados:** El método principal `listLevels(Node root)` inicializa un `ArrayList`. Luego, el método recursivo llena ese contenedor con elementos `LinkedList` para cada nivel.
* **Pruebas y Resultados:** Construimos el árbol exacto del ejemplo (`4, 2, 7, 1, 3, 6, 9`). El resultado en consola mostró exactamente cada nivel en una línea separada y conectada por flechas (`1 -> 3 -> 6 -> 9`), cumpliendo con el formato esperado.

**Estructura del Código:**
![Estructura Ejercicio 3](src/img/Ejercicio3Estructura.png)

**Resultado en Consola:**
![Consola Ejercicio 3](src/img/Ejercicio3Consola.png)

### Ejercicio 04: Calcular la Profundidad Máxima
* **Objetivo:** Encontrar el camino más largo desde la raíz principal hasta la última hoja.
* **Lógica:** Usamos la recursividad, mandamos a revisar el lado izquierdo y el derecho. Al regresar, el programa usa la función matemática `Math.max` para elegir el camino que reportó mayor profundidad y le suma 1 el nivel actual.
* **Métodos utilizados:** Un único método recursivo `maxDepth(Node root)` que retorna un número entero (`int`).
* **Pruebas y Resultados:** Se armó el árbol del ejemplo `4, 2, 7, 1, 3` y se agregó manualmente el nodo `8` a la izquierda del `1` para imitar la figura del ejemplo. La consola imprimió correctamente `4`.

**Estructura del Código:**
![Estructura Ejercicio 4](src/img/Ejercicio4Estructura.png)

**Resultado en Consola:**
![Consola Ejercicio 4](src/img/Ejercicio4Consola.png)



## Conclusiones
A través de esta práctica, se comprobó que la **recursividad** es la herramienta más natural y eficiente para trabajar con Estructuras No Lineales. Permite escribir código mucho más corto y fácil de entender al dividir problemas complejos (como calcular la altura de todo un árbol) en problemas más pequeños (calcular la altura de solo un hijo izquierdo y derecho). Además, se logró entender correctamente la forma en que la consola imprime los árboles horizontalmente mediante el cálculo de espacios.