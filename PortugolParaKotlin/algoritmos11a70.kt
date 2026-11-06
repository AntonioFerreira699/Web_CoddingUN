import kotlin.math.*

fun main() {
    println("=== EXECUÇÃO DOS ALGORITMOS (PARTE 1: 11 a 70) ===")
    print("Digite o número do algoritmo que deseja rodar (11 a 70): ")
    val opcao = readLine()?.toIntOrNull() ?: 0

    when (opcao) {
        11 -> alg11(); 12 -> alg12(); 13 -> alg13(); 14 -> alg14(); 15 -> alg15()
        16 -> alg16(); 17 -> alg17(); 18 -> alg18(); 19 -> alg19(); 20 -> alg20()
        21 -> alg21(); 22 -> alg22(); 23 -> alg23(); 24 -> alg24(); 25 -> alg25()
        26 -> alg26(); 27 -> alg27(); 28 -> alg28(); 29 -> alg29(); 30 -> alg30()
        31 -> alg31(); 32 -> alg32(); 33 -> alg33(); 34 -> alg34(); 35 -> alg35()
        36 -> alg36(); 37 -> alg37(); 38 -> alg38(); 39 -> alg39(); 40 -> alg40()
        41 -> alg41(); 42 -> alg42(); 43 -> alg43(); 44 -> alg44(); 45 -> alg45()
        46 -> alg46(); 47 -> alg47(); 48 -> alg48(); 49 -> alg49(); 50 -> alg50()
        51 -> alg51(); 52 -> alg52(); 53 -> alg53(); 54 -> alg54(); 55 -> alg55()
        56 -> alg56(); 57 -> alg57(); 58 -> alg58(); 59 -> alg59(); 60 -> alg60()
        61 -> alg61(); 62 -> alg62(); 63 -> alg63(); 64 -> alg64(); 65 -> alg65()
        66 -> alg66(); 67 -> alg67(); 68 -> alg68(); 69 -> alg69(); 70 -> alg70()
        else -> println("Algoritmo não encontrado ou fora do escopo desta parte!")
    }
}

// Algoritmo 11
fun alg11() {
    println("Aprendendo Algoritmo!!!")
}

// Algoritmo 12[cite: 1]
fun alg12() {
    print("Aprendendo Algoritmo!!!")
    print("Com Anita e Guto")
}

// Algoritmo 13[cite: 1]
fun alg13() {
    print("Aprendendo Algoritmo!!!")
    print("\nCom Anita e Guto")
}

// Algoritmo 14[cite: 1]
fun alg14() {
    print("Aprendendo Algoritmo!!!\n")
    print("Com Anita e Guto")
}

// Algoritmo 15[cite: 1]
fun alg15() {
    println("Aprendendo Algoritmo\nCom Anita e Guto\n\nE implementando\nFica muito mais fácil!!")
}

// Algoritmo 16[cite: 1]
fun alg16() {
    var x = 10
    println(x)
}

// Algoritmo 17[cite: 1]
fun alg17() {
    var x = 10
    println("Valor de x = $x")
}

// Algoritmo 18[cite: 1]
fun alg18() {
    var x = 10
    println("Valor de x + 1 = ${x + 1}")
}

// Algoritmo 19[cite: 1]
fun alg19() {
    println("raiz: ${sqrt(64.0)}")
    println("potência: ${8.0.pow(3)}")
    println("absoluto: ${abs(-8)}")
    println("arredondado 5.51: ${5.51.roundToInt()}")
    println("inteiro 87 para real: ${87.toDouble()}")
    println("divisão inteira 3/4: ${3 / 4}")
}

// Algoritmo 20[cite: 1]
fun alg20() {
    print("Digite palavra 1: ")
    val c = readLine()!!
    print("Digite palavra 2: ")
    val c1 = readLine()!!
    println("Tamanho: ${c.length}")
    println("Concatenando: ${c + c1}")
    println("Primeiro caractere: ${c.first()}")
    println("Último caractere: ${c.last()}")
    println("Todos menos o primeiro: ${c.drop(1)}")
    println("Três primeiros: ${c.take(3)}")
    println("Três últimos: ${c.takeLast(3)}")
}

// Algoritmo 21[cite: 1]
fun alg21() {
    println("12 + 5 / 2 = ${12 + 5 / 2.0}")
    println("(12 + 5) / 2 = ${(12 + 5) / 2.0}")
    println("3 * (7 % 5) = ${3 * (7 % 5)}")
    println("(3 * 7) % 5 = ${(3 * 7) % 5}")
    println("3 * 7 / 5 (inteira) = ${3 * 7 / 5}")
}

// Algoritmo 22[cite: 1]
fun alg22() {
    println("20 / 4 / 2 = ${20 / 4 / 2}")
    println("30 / 4 / 2 = ${30 / 4 / 2}")
    println("7 / 4 = ${7 / 4}")
    println("6 / 4 = ${6 / 4}")
}

// Algoritmo 23[cite: 1]
fun alg23() {
    print("Digite número de três casas: ")
    val a = readLine()!!.toInt()
    val d = a % 100 / 10
    println("Algarismo das dezenas: $d")
}

// Algoritmo 24[cite: 1]
fun alg24() {
    print("Digite número de três casas: ")
    val a = readLine()!!.toInt()
    val d = (a / 10) % 10
    println("Algarismo das dezenas: $d")
}

// Algoritmo 25[cite: 1]
fun alg25() {
    print("Digite data no formato ddmmaa: ")
    val data = readLine()!!.toInt()
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
}

// Algoritmo 26[cite: 1]
fun alg26() {
    print("Digite data no formato ddmmaa: ")
    val data = readLine()!!.toInt()
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    val novaData = mes * 10000 + dia * 100 + ano
    println("Data no formato mmddaa: $novaData")
}

// Algoritmo 27[cite: 1]
fun alg27() {
    var x = 2
    var y = 5
    println("x = $x")
    x++
    println("y = $y")
    y--
    println("novo valor de x = $x")
    println("novo valor de y = $y")
}

// Algoritmo 28[cite: 1]
fun alg28() {
    println("É PRECISO FAZER TODOS OS ALGORITMOS PARA APRENDER")
}

// Algoritmo 29[cite: 1]
fun alg29() {
    println("Toni")
}

// Algoritmo 30[cite: 1]
fun alg30() {
    val produto = 28 * 43
    println("O produto entre os dois é: $produto")
}

// Algoritmo 31[cite: 1]
fun alg31() {
    val ma = (8 + 9 + 7) / 3.0
    println("A média aritmética é: $ma")
}

// Algoritmo 32[cite: 1]
fun alg32() {
    print("Entre com um número: ")
    val num = readLine()!!.toInt()
    println("Número: $num")
}

// Algoritmo 33[cite: 1]
fun alg33() {
    print("Entre com um número: ")
    val num1 = readLine()!!.toInt()
    print("Entre com outro número: ")
    val num2 = readLine()!!.toInt()
    println("Número 1: $num1")
    println("Número 2: $num2")
}

// Algoritmo 34[cite: 1]
fun alg34() {
    print("Entre com um número: ")
    val numero = readLine()!!.toInt()
    val ant = numero - 1
    val suc = numero + 1
    println("O sucessor é $suc e o antecessor é $ant")
}

// Algoritmo 35[cite: 1]
fun alg35() {
    print("Entre com nome: ")
    val nome = readLine()!!
    print("Entre com endereço: ")
    val endereco = readLine()!!
    print("Entre com telefone: ")
    val telefone = readLine()!!
    println()
    println("Nome: $nome")
    println("Endereço: $endereco")
    println("Telefone: $telefone")
}

// Algoritmo 36[cite: 1]
fun alg36() {
    print("Entre com um número: ")
    val num1 = readLine()!!.toInt()
    print("Entre com outro número: ")
    val num2 = readLine()!!.toInt()
    val soma = num1 + num2
    println("Soma: $soma")
}

// Algoritmo 37[cite: 1]
fun alg37() {
    print("Entre com um número: ")
    val num1 = readLine()!!.toInt()
    print("Entre com outro número: ")
    val num2 = readLine()!!.toInt()
    val prod = num1 * num2
    println("Produto: $prod")
}

// Algoritmo 38[cite: 1]
fun alg38() {
    print("Entre com um número com ponto: ")
    val num = readLine()!!.toDouble()
    println("A terça parte é: ${num / 3}")
}

// Algoritmo 39[cite: 1]
fun alg39() {
    print("Digite a 1ª nota: ")
    val nota1 = readLine()!!.toDouble()
    print("Digite a 2ª nota: ")
    val nota2 = readLine()!!.toDouble()
    val media = (nota1 + nota2) / 2
    println("Média: $media")
}

// Algoritmo 40[cite: 1]
fun alg40() {
    print("Entre com o dividendo: ")
    val val1 = readLine()!!.toInt()
    print("Entre com o divisor: ")
    val val2 = readLine()!!.toInt()
    val quoc = val1 / val2
    val rest = val1 % val2
    println("Dividendo: $val1")
    println("Divisor: $val2")
    println("Quociente: $quoc")
    println("Resto: $rest")
}

// Algoritmo 41[cite: 1]
fun alg41() {
    print("Entre com 1º número: ")
    val a = readLine()!!.toDouble()
    print("Entre com 2º número: ")
    val b = readLine()!!.toDouble()
    print("Entre com 3º número: ")
    val c = readLine()!!.toDouble()
    print("Entre com 4º número: ")
    val d = readLine()!!.toDouble()
    val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10
    println("Média ponderada: $mp")
}

// Algoritmo 42[cite: 1]
fun alg42() {
    print("Digite um ângulo em graus: ")
    val angulo = readLine()!!.toDouble()
    val rang = angulo * PI / 180
    println("Seno: ${sin(rang)}")
    println("Co-seno: ${cos(rang)}")
    println("Tangente: ${tan(rang)}")
    println("Co-secante: ${1 / sin(rang)}")
    println("Secante: ${1 / cos(rang)}")
    println("Cotangente: ${1 / tan(rang)}")
}

// Algoritmo 43[cite: 1]
fun alg43() {
    print("Entre com o logaritmando: ")
    val num = readLine()!!.toDouble()
    val logaritmo = ln(num) / ln(10.0)
    println("Logaritmo: $logaritmo")
}

// Algoritmo 44[cite: 1]
fun alg44() {
    print("Entre com o logaritmando: ")
    val num = readLine()!!.toDouble()
    print("Entre com a base: ")
    val base = readLine()!!.toDouble()
    val logaritmo = ln(num) / ln(base)
    println("O logaritmo de $num na base $base é: $logaritmo")
}

// Algoritmo 45[cite: 1]
fun alg45() {
    print("Digite número: ")
    val num = readLine()!!.toDouble()
    val quad = num.pow(2)
    val raizQuad = sqrt(num)
    println("Número: $num")
    println("Quadrado: $quad")
    println("Raiz quadrada: $raizQuad")
}

// Algoritmo 46[cite: 1]
fun alg46() {
    print("Digite saldo: ")
    val saldo = readLine()!!.toDouble()
    val nsaldo = saldo * 1.01
    println("Novo saldo: $nsaldo")
}

// Algoritmo 47[cite: 1]
fun alg47() {
    print("Entre com um número de 3 dígitos: ")
    val num = readLine()!!.toInt()
    val c = num / 100
    val d = num % 100 / 10
    val u = num % 10
    val num1 = u * 100 + d * 10 + c
    println("Número: $num")
    println("Invertido: $num1")
}

// Algoritmo 48[cite: 1]
fun alg48() {
    print("Entre com o salário mínimo: ")
    val sm = readLine()!!.toDouble()
    print("Entre com a quantidade em quilowatt: ")
    val qtdade = readLine()!!.toDouble()
    val preco = sm / 700
    val vp = preco * qtdade
    val vd = vp * 0.9
    println("Preço do quilowatt: $preco")
    println("Valor a ser pago: $vp")
    println("Valor com desconto: $vd")
}

// Algoritmo 49[cite: 1]
fun alg49() {
    print("Entre com nome: ")
    val nome = readLine()!!
    println("Todo nome: $nome")
    println("Primeiro caractere: ${nome.first()}")
    println("Último caractere: ${nome.last()}")
    println("Primeiro ao terceiro: ${nome.take(3)}")
    println("Quarto caractere: ${nome[3]}")
    println("Todos menos o primeiro: ${nome.drop(1)}")
    println("Os dois últimos: ${nome.takeLast(2)}")
}

// Algoritmo 50[cite: 1]
fun alg50() {
    print("Digite base: ")
    val base = readLine()!!.toDouble()
    print("Digite altura: ")
    val altura = readLine()!!.toDouble()
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base.pow(2) + altura.pow(2))
    println("Perímetro = $perimetro")
    println("Área = $area")
    println("Diagonal = $diagonal")
}

// Algoritmo 51[cite: 1]
fun alg51() {
    print("Digite raio: ")
    val raio = readLine()!!.toDouble()
    val perimetro = 2 * PI * raio
    val area = PI * raio.pow(2)
    println("Perímetro: $perimetro")
    println("Área: $area")
}

// Algoritmo 52[cite: 1]
fun alg52() {
    print("Digite o lado do quadrado: ")
    val lado = readLine()!!.toDouble()
    val perimetro = 4 * lado
    val area = lado.pow(2)
    val diagonal = lado * sqrt(2.0)
    println("Perímetro: $perimetro")
    println("Área: $area")
    println("Diagonal: $diagonal")
}

// Algoritmo 53[cite: 1]
fun alg53() {
    print("Entre com a base: ")
    val a = readLine()!!.toDouble()
    print("Entre com a altura: ")
    val b = readLine()!!.toDouble()
    print("Entre com a profundidade: ")
    val c = readLine()!!.toDouble()
    val diagonal = sqrt(a.pow(2) + b.pow(2) + c.pow(2))
    println("Diagonal: $diagonal")
}

// Algoritmo 54[cite: 1]
fun alg54() {
    print("Entre com a base: ")
    val a = readLine()!!.toDouble()
    print("Entre com a altura do triângulo: ")
    val b = readLine()!!.toDouble()
    println("Área = ${(a * b) / 2}")
}

// Algoritmo 55[cite: 1]
fun alg55() {
    print("Medida da diagonal maior: ")
    val diagMaior = readLine()!!.toDouble()
    print("Medida da diagonal menor: ")
    val diagMenor = readLine()!!.toDouble()
    val area = (diagMaior * diagMenor) / 2
    println("Área = $area")
}

// Algoritmo 56[cite: 1]
fun alg56() {
    print("Digite nome: ")
    val nome = readLine()!!
    print("Digite idade: ")
    val idade = readLine()!!.toInt()
    println()
    println("Nome = $nome")
    println("Idade = $idade")
}

// Algoritmo 57[cite: 1]
fun alg57() {
    print("Digite PR1: ")
    val pr1 = readLine()!!.toDouble()
    print("Digite PR2: ")
    val pr2 = readLine()!!.toDouble()
    val mf = (pr1 + pr2) / 2
    println("Média truncada = ${mf.toInt()}")
    println("Média arredondada = ${mf.roundToInt()}")
}

// Algoritmo 58[cite: 1]
fun alg58() {
    print("Entrar com 1º valor: ")
    val xnum1 = readLine()!!.toDouble()
    print("Entrar com 2º valor: ")
    val xnum2 = readLine()!!.toDouble()
    print("Entrar com 3º valor: ")
    val xnum3 = readLine()!!.toDouble()
    val x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)
    println("X = $x")
}

// Algoritmo 59[cite: 1]
fun alg59() {
    print("Entrar com 1º cateto: ")
    val b = readLine()!!.toDouble()
    print("Entrar com 2º cateto: ")
    val c = readLine()!!.toDouble()
    val a = sqrt(b.pow(2) + c.pow(2))
    println("A hipotenusa é: $a")
}

// Algoritmo 60[cite: 1]
fun alg60() {
    print("Entrar com o 1º termo: ")
    val termo = readLine()!!.toInt()
    print("Entrar com a razão: ")
    val razao = readLine()!!.toInt()
    val dec = termo + 9 * razao
    println("O 10º termo desta P.A. é: $dec")
}

// Algoritmo 61[cite: 1]
fun alg61() {
    print("Entre com o 1º termo: ")
    val termo = readLine()!!.toInt()
    print("Entre com a razão: ")
    val razao = readLine()!!.toInt()
    var quinto = termo
    for (i in 1..4) {
        quinto *= razao
    }
    println("O 5º termo desta P.G. é: $quinto")
}

// Algoritmo 62[cite: 1]
fun alg62() {
    print("Digite valor do produto: ")
    val preco = readLine()!!.toDouble()
    val npreco = preco * 0.91
    println("Preço com desconto: $npreco")
}

// Algoritmo 63[cite: 1]
fun alg63() {
    print("Horas trabalhadas: ")
    val na = readLine()!!.toInt()
    print("Valor da hora-aula: ")
    val vha = readLine()!!.toDouble()
    print("Percentual de desconto: ")
    val pd = readLine()!!.toDouble()
    val sb = na * vha
    val td = (pd / 100) * sb
    val sl = sb - td
    println("Salário líquido: $sl")
}

// Algoritmo 64[cite: 1]
fun alg64() {
    print("Digite a temperatura em graus centígrados: ")
    val c = readLine()!!.toDouble()
    val f = (9 * c + 160) / 5
    println("Temperatura em Fahrenheit = $f")
}

// Algoritmo 65[cite: 1]
fun alg65() {
    print("Digite a altura da lata: ")
    val altura = readLine()!!.toDouble()
    print("Digite o raio da lata: ")
    val raio = readLine()!!.toDouble()
    val volume = PI * raio.pow(2) * altura
    println("O volume da lata é = $volume")
}

// Algoritmo 66[cite: 1]
fun alg66() {
    print("Digite o tempo gasto: ")
    val tempo = readLine()!!.toDouble()
    print("Digite a velocidade média: ")
    val vel = readLine()!!.toDouble()
    val dist = tempo * vel
    val litros = dist / 12
    println("Velocidade = $vel")
    println("Tempo = $tempo")
    println("Distância = $dist")
    println("Litros = $litros")
}

// Algoritmo 67[cite: 1]
fun alg67() {
    print("Digite o valor da prestação: ")
    val valor = readLine()!!.toDouble()
    print("Digite a taxa: ")
    val taxa = readLine()!!.toDouble()
    print("Digite o tempo (número de meses): ")
    val tempo = readLine()!!.toInt()
    val prest = valor + (valor * (taxa / 100) * tempo)
    println("O valor da prestação em atraso é = $prest")
}

// Algoritmo 68[cite: 1]
fun alg68() {
    print("Digite 1º número com ponto: ")
    var a = readLine()!!.toDouble()
    print("Digite 2º número com ponto: ")
    var b = readLine()!!.toDouble()
    val aux = a
    a = b
    b = aux
    println("a = $a")
    println("b = $b")
}

// Algoritmo 69[cite: 1]
fun alg69() {
    print("Digite numerador: ")
    val num = readLine()!!.toInt()
    print("Digite denominador: ")
    val denom = readLine()!!.toInt()
    println("Decimal: ${num.toDouble() / denom}")
}

// Algoritmo 70[cite: 1]
fun alg70() {
    print("Entre com o valor da conta: ")
    val cres = readLine()!!.toDouble()
    val cgorj = cres * 1.1
    println("O valor da conta com a gorjeta será: ${"%.2f".format(cgorj)}")
}
