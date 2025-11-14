//Promt usado en chat gpt
//Hola chat ayudame a corregir esto usando fundamentos de programacion funcional y reactiva de tal manera que siguiendo las instrucciones del parentesis (Transforme el siguiente método Java desarrollado de forma imperativa a una versión funcional utilizando Scala. double myMethod(List<Double> datos) { List<Double> logs = new ArrayList<>(); for (int i = 0; i < datos.size(); i++) { logs.add(Math.log(datos.get(i))); } double sumaLogs = 0.0; for (int i = 0; i < logs.size(); i++) { sumaLogs += logs.get(i); } double promedioLog = sumaLogs / logs.size(); double sumaCuadrados = 0.0; for (int i = 0; i < logs.size(); i++) { double diferencia = logs.get(i) - promedioLog; sumaCuadrados += diferencia * diferencia; } return Math.sqrt(sumaCuadrados / logs.size()); } Pregunta 2 Ajuste de precios con políticas variables En una tienda digital se trabaja con listas de precios que necesitan ser ajustadas antes de ser mostradas al usuario. De acuerdo con el país, la temporada o las promociones vigentes, el ajuste puede consistir en agregar un impuesto, aplicar un descuento o modificar el precio según cierta estrategia comercial. Se requiere elaborar una solución donde exista una única función capaz de recibir la lista de precios y, además, la función que representa la regla de ajuste que se quiera aplicar en ese momento. Esta función deberá retornar una nueva lista de precios ya modificados de acuerdo con la política específica que se haya suministrado. Pregunta 3 Transforme la función anónima a una función con nombre val generadorIncrementadorAnonimo: Int => (Int => Int) = (incremento: Int) => (x: Int) => x + incremento) corrijas mi codigo que es el siguiente: // Ejercicio 1 def myMethod(datos: List[Double]): Double = { val logs: List[Double] = datos.map((x: Double) => math.log(x)) val n: Int = logs.size val sumaLogs: Double = logs.sum val promedioLog: Double = sumaLogs / n.toDouble val cuadrados: List[Double] = logs.map((l: Double) => { val diferencia: Double = l - promedioLog val cuadrado: Double = diferencia * diferencia cuadrado }) val sumaCuadrados: Double = cuadrados.sum val varianza: Double = sumaCuadrados / n.toDouble val desviacionEstandar: Double = math.sqrt(varianza) desviacionEstandar } // Ejercicio 2 def ajustarPrecios(precios: List[Double], politica: Double => Double): List[Double] = { val resultado: List[Double] = precios.map((p: Double) => politica(p)) resultado } // Ejercicio 3 def generadorIncrementador(incremento: Int): Int => Int = { val f: Int => Int = (x: Int) => { val resultado: Int = x + incremento resultado } f }
// Ejercicio 1
def myMethod(datos: List[Double]): Double = {
  val logs = datos.map(math.log)
  val promedio = logs.sum / logs.size
  val varianza = logs.map(l => math.pow(l - promedio, 2)).sum / logs.size
  math.sqrt(varianza)
}

// Ejercicio 2
def ajustarPrecios(precios: List[Double], politica: Double => Double): List[Double] =
  precios.map(politica)

// Ejercicio 3
def generadorIncrementador(incremento: Int): Int => Int =
  x => x + incremento
