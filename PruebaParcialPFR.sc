// Ejercicio 1
def myMethod(datos: List[Double]): Double = {
  val logs: List[Double] = datos.map((x: Double) => math.log(x))

  val n: Int = logs.size
  val sumaLogs: Double = logs.sum
  val promedioLog: Double = sumaLogs / n.toDouble

  val cuadrados: List[Double] = logs.map((l: Double) => {
    val diferencia: Double = l - promedioLog
    val cuadrado: Double = diferencia * diferencia
    cuadrado
  })
  val sumaCuadrados: Double = cuadrados.sum

  val varianza: Double = sumaCuadrados / n.toDouble
  val desviacionEstandar: Double = math.sqrt(varianza)
  desviacionEstandar
}
// Ejercicio 2
def ajustarPrecios(precios: List[Double], politica: Double => Double): List[Double] = {
  val resultado: List[Double] = precios.map((p: Double) => politica(p))
  resultado
}
// Ejercicio 3
def generadorIncrementador(incremento: Int): Int => Int = {
  val f: Int => Int = (x: Int) => {
    val resultado: Int = x + incremento
    resultado
  }
  f
}