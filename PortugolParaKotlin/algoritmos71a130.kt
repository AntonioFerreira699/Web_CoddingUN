import kotlin.math.*

fun main() {
    println("=== EXECUÇÃO DOS ALGORITMOS (PARTE 2: 71 a 130) ===")
    print("Digite o número do algoritmo que deseja rodar (71 a 130): ")
    val opcao = readLine()?.toIntOrNull() ?: 0

    when (opcao) {
        71 -> alg71(); 72 -> alg72(); 73 -> alg73(); 74 -> alg74(); 75 -> alg75()
        76 -> alg76(); 77 -> alg77(); 78 -> alg78(); 79 -> alg79(); 80 -> alg80()
        81 -> alg81(); 82 -> alg82(); 83 -> alg83(); 84 -> alg84(); 85 -> alg85()
        86 -> alg86(); 87 -> alg87(); 88 -> alg88(); 89 -> alg89(); 90 -> alg90()
        91 -> alg91(); 92 -> alg92(); 93 -> alg93(); 94 -> alg94(); 95 -> alg95()
        96 -> alg96(); 97 -> alg97(); 98 -> alg98(); 99 -> alg99(); 100 -> alg100()
        101 -> alg101(); 102 -> alg102(); 103 -> alg103(); 104 -> alg104(); 105 -> alg105()
        106 -> alg106(); 107 -> alg107(); 108 -> alg108(); 109 -> alg109(); 110 -> alg110()
        111 -> alg111(); 112 -> alg112(); 113 -> alg113(); 114 -> alg114(); 115 -> alg115()
        116 -> alg116(); 117 -> alg117(); 118 -> alg118(); 119 -> alg119(); 120 -> alg120()
        121 -> alg121(); 122 -> alg122(); 123 -> alg123(); 124 -> alg124(); 125 -> alg125()
        126 -> alg126(); 127 -> alg127(); 128 -> alg128(); 129 -> alg129(); 130 -> alg130()
        else -> println("Algoritmo não encontrado ou fora do escopo desta parte!")
    }
}

// Algoritmo 71[cite: 1]
fun alg71() {
    print("Entre com hora atual: ")
    val hora = readLine()!!.toInt()
    print("Entre com minutos: ")
    val minuto = readLine()!!.toInt()
    println("Até agora se passaram: ${hora * 60 + minuto} minutos")
}

// Algoritmo 72[cite: 1]
fun alg72() {
    print("Entre com depósito: ")
    val deposito = readLine()!!.toDouble()
    print("Entre com a taxa de juros: ")
    val taxa = readLine()!!.toDouble()
    val valor = deposito * taxa / 100
    println("Rendimentos: $valor")
    println("Total: ${deposito + valor}")
}

// Algoritmo 73[cite: 1]
fun alg73() {
    print("Entre com um número com parte fracionária: ")
    val num = readLine()!!.toDouble()
    val numi = num.toInt()
    println("Parte inteira: $numi")
    println("Parte fracionária: ${"%.3f".format(num - numi)}")
    println("Número arredondado: ${num.roundToInt()}")
}

// Algoritmo 74[cite: 1]
fun alg74() {
    print("Entre com o salário mínimo: ")
    val salmin = readLine()!!.toDouble()
    print("Entre com o salário da pessoa: ")
    val salpe = readLine()!!.toDouble()
    println("A pessoa ganha ${salpe / salmin} salários mínimos")
}

// Algoritmo 75[cite: 1]
fun alg75() {
    print("Entre com seu peso, só a parte inteira: ")
    val peso = readLine()!!.toInt()
    val pesoGramas = peso * 1000
    println("Peso em gramas: $pesoGramas")
    println("Novo peso: ${(pesoGramas * 1.12).toInt()}")
}

// Algoritmo 76[cite: 1]
fun alg76() {
    print("Digite número: ")
    val num = readLine()!!.toInt()
    println("Sucessor: ${(num + 1) % 61}")
}

// Algoritmo 77[cite: 1]
fun alg77() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    println("O quadrado da diferença = ${(a - b).pow(2)}")
    println("Diferença dos quadrados = ${a.pow(2) - b.pow(2)}")
}

// Algoritmo 78[cite: 1]
fun alg78() {
    print("Digite o número de lados do polígono: ")
    val n = readLine()!!.toInt()
    println("Número de diagonais: ${n * (n - 3) / 2.0}")
}

// Algoritmo 79[cite: 1]
fun alg79() {
    print("Digite o valor da aplicação: ")
    val p = readLine()!!.toDouble()
    print("Digite a taxa (ex: 0.01): ")
    val i = readLine()!!.toDouble()
    print("Digite o número de meses: ")
    val n = readLine()!!.toInt()
    println("O valor acumulado: ${p * ((1 + i).pow(n) - 1) / i}")
}

// Algoritmo 80[cite: 1]
fun alg80() {
    print("Digite a quantidade de fitas: ")
    val quant = readLine()!!.toInt()
    print("Digite o valor do aluguel: ")
    val valAluguel = readLine()!!.toDouble()
    println("Faturamento anual: ${quant / 3.0 * valAluguel * 12}")
    println("Multas mensais: ${valAluguel * 0.1 * (quant / 3.0) / 10}")
    println("Quantidade de fitas no final do ano: ${quant - quant * 0.02 + quant / 10.0}")
}

// Algoritmo 81[cite: 1]
fun alg81() {
    print("Digite conta de três dígitos: ")
    val conta = readLine()!!.toInt()
    var d1 = conta / 100
    var d2 = conta % 100 / 10
    var d3 = conta % 10
    val soma = conta + (d3 * 100 + d2 * 10 + d1)
    d1 = (soma / 100) * 1
    d2 = (soma % 100 / 10) * 2
    d3 = (soma % 10) * 3
    println("Dígito verificador: ${(d1 + d2 + d3) % 10}")
}

// Algoritmo 82[cite: 1]
fun alg82() {
    print("Digite número: ")
    val numero = readLine()!!.toDouble()
    if (numero > 20) {
        println("Metade: ${numero / 2}")
    }
}

// Algoritmo 83[cite: 1]
fun alg83() {
    print("Digite número: ")
    val numero = readLine()!!.toDouble()
    if (numero > 0) {
        println("Inverso: ${1 / numero}")
    } else {
        println("Absoluto: ${abs(numero)}")
    }
}

// Algoritmo 84[cite: 1]
fun alg84() {
    print("Digite número: ")
    val a = readLine()!!.toInt()
    if (a % 2 == 0) {
        println("PAR")
    } else {
        println("ÍMPAR")
    }
}

// Algoritmo 85[cite: 1]
fun alg85() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    val c = readLine()!!.toDouble()
    println(if (a > b && a > c) a else if (b > c) b else c)
}

// Algoritmo 86[cite: 1]
fun alg86() {
    print("Digite número: ")
    val num = readLine()!!.toDouble()
    if (num > 0) {
        println("POSITIVO")
    } else if (num < 0) {
        println("NEGATIVO")
    } else {
        println("NULO")
    }
}

// Algoritmo 87[cite: 1]
fun alg87() {
    print("Qual a capital do Brasil? ")
    val resp = readLine()!!
    if (resp == "BRASÍLIA" || resp == "Brasília") {
        println("PARABÉNS!")
    } else if (resp.lowercase() == "brasília" || resp.lowercase() == "brazília") {
        println("CERTO! Mas atenção para grafia: Brasília ou BRASÍLIA")
    } else {
        println("ERRADO! ESTUDE MAIS!")
    }
}

// Algoritmo 88[cite: 1]
fun alg88() {
    println("*************\n*CALCULADORA*\n*************\n+ para somar\n- para subtrair\n* para multiplicar\n/ para dividir")
    print("Digite opção: ")
    val resp = readLine()!!
    if (resp in listOf("+", "-", "*", "/")) {
        print("Digite 1º número: ")
        val a = readLine()!!.toDouble()
        print("Digite 2º número: ")
        val b = readLine()!!.toDouble()
        when (resp) {
            "+" -> println("SOMA: ${a + b}")
            "-" -> println("SUBTRAÇÃO: ${a - b}")
            "*" -> println("MULTIPLICAÇÃO: ${a * b}")
            "/" -> println("DIVISÃO: ${a / b}")
        }
    } else {
        println("OPÇÃO NÃO DISPONÍVEL!")
    }
}

// Algoritmo 89[cite: 1]
fun alg89() {
    println("Planetas:\n1 Mercúrio\n2 Vênus\n3 Marte\n4 Júpiter\n5 Saturno\n6 Urano")
    print("Escolha: ")
    val op = readLine()!!.toInt()
    print("Peso na Terra: ")
    val pterra = readLine()!!.toDouble()
    when (op) {
        1 -> println("Peso: ${(pterra / 10) * 0.37}")
        2 -> println("Peso: ${(pterra / 10) * 0.88}")
        3 -> println("Peso: ${(pterra / 10) * 0.38}")
        4 -> println("Peso: ${(pterra / 10) * 2.64}")
        5 -> println("Peso: ${(pterra / 10) * 1.15}")
        6 -> println("Peso: ${(pterra / 10) * 1.17}")
        else -> println("Planeta não analisado")
    }
}

// Algoritmo 90[cite: 1]
fun alg90() {
    print("Digite número: ")
    val numero = readLine()!!.toDouble()
    if (numero > 20) {
        println(numero)
    }
}

// Algoritmo 91[cite: 1]
fun alg91() {
    print("Digite 1º número: ")
    val num1 = readLine()!!.toInt()
    print("Digite 2º número: ")
    val num2 = readLine()!!.toInt()
    val soma = num1 + num2
    if (soma > 10) {
        println("Soma: $soma")
    }
}

// Algoritmo 92[cite: 1]
fun alg92() {
    print("Digite 1º número: ")
    val num1 = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val num2 = readLine()!!.toDouble()
    val soma = num1 + num2
    if (soma > 20) {
        println("Soma: ${soma + 8}")
    } else {
        println("Soma: ${soma - 5}")
    }
}

// Algoritmo 93[cite: 1]
fun alg93() {
    print("Digite número: ")
    val numero = readLine()!!.toDouble()
    if (numero > 0) {
        println("Raiz: ${sqrt(numero)}")
    } else if (numero < 0) {
        println("Quadrado: ${numero.pow(2)}")
    }
}

// Algoritmo 94[cite: 1]
fun alg94() {
    print("Digite número: ")
    val numero = readLine()!!.toInt()
    if (numero % 3 == 0) {
        println("Múltiplo de 3")
    } else {
        println("Não é múltiplo de 3")
    }
}

// Algoritmo 95[cite: 1]
fun alg95() {
    print("Digite número: ")
    val numero = readLine()!!.toInt()
    if (numero % 5 == 0) {
        println("É divisível por 5")
    } else {
        println("Não é divisível por 5")
    }
}

// Algoritmo 96[cite: 1]
fun alg96() {
    print("Digite número: ")
    val numero = readLine()!!.toInt()
    if (numero % 3 == 0 && numero % 7 == 0) {
        println("Divisível por 3 e por 7")
    } else {
        println("Não é divisível por 3 e por 7")
    }
}

// Algoritmo 97[cite: 1]
fun alg97() {
    print("Digite número: ")
    val numero = readLine()!!.toInt()
    if (numero % 10 == 0) {
        println("Múltiplo de 10")
    } else if (numero % 2 == 0) {
        println("Múltiplo de 2")
    } else if (numero % 5 == 0) {
        println("Múltiplo de 5")
    } else {
        println("Não é múltiplo de 2 nem de 5")
    }
}

// Algoritmo 98[cite: 1]
fun alg98() {
    print("Digite o salário: ")
    val sb = readLine()!!.toDouble()
    print("Digite o valor da prestação: ")
    val vp = readLine()!!.toDouble()
    if (vp <= 0.3 * sb) {
        println("Empréstimo concedido")
    } else {
        println("Empréstimo negado")
    }
}

// Algoritmo 99[cite: 1]
fun alg99() {
    print("Número de 3 algarismos: ")
    val num = readLine()!!.toInt()
    val c = num / 100
    if (c % 2 == 0) {
        println("O algarismo das centenas é par: $c")
    } else {
        println("O algarismo das centenas é ímpar: $c")
    }
}

// Algoritmo 100[cite: 1]
fun alg100() {
    print("Número de 4 algarismos: ")
    val num = readLine()!!.toInt()
    val c = num % 10000 / 100
    if (c % 4 == 0) {
        println("O número $c é múltiplo de 4")
    } else {
        println("O número $c não é múltiplo de 4")
    }
}

// Algoritmo 101[cite: 1]
fun alg101() {
    print("Digite número: ")
    val num = readLine()!!.toDouble()
    if (num > 20 && num < 90) {
        println("O número está na faixa de 20 a 90")
    } else {
        println("O número está fora da faixa de 20 a 90")
    }
}

// Algoritmo 102[cite: 1]
fun alg102() {
    print("Digite número: ")
    val numero = readLine()!!.toDouble()
    if (numero > 20) {
        println("Maior que 20")
    } else if (numero < 20) {
        println("Menor que 20")
    } else {
        println("Igual a 20")
    }
}

// Algoritmo 103[cite: 1]
fun alg103() {
    print("Entre com ano atual: ")
    val anoa = readLine()!!.toInt()
    print("Entre com ano de nascimento: ")
    val anon = readLine()!!.toInt()
    if (anon > anoa) {
        println("Ano de nascimento inválido")
    } else {
        println("Idade: ${anoa - anon}")
    }
}

// Algoritmo 104[cite: 1]
fun alg104() {
    print("Digite nome: ")
    val nome = readLine()!!
    print("Digite sexo: ")
    val sexo = readLine()!!
    print("Digite idade: ")
    val idade = readLine()!!.toInt()
    if (sexo.uppercase() == "F" && idade < 25) {
        println("$nome ACEITA")
    } else {
        println("$nome NÃO ACEITA")
    }
}

// Algoritmo 105[cite: 1]
fun alg105() {
    print("Digite sigla: ")
    val sigla = readLine()!!.uppercase()
    when (sigla) {
        "RJ" -> println("carioca")
        "SP" -> println("paulista")
        "MG" -> println("mineiro")
        else -> println("outros estados")
    }
}

// Algoritmo 106[cite: 1]
fun alg106() {
    print("Digite nome: ")
    val nome = readLine()!!
    if (nome.first().uppercase() == "A") {
        println(nome)
    }
}

// Algoritmo 107[cite: 1]
fun alg107() {
    print("Digite nome: ")
    val nome = readLine()!!
    if (nome.take(5) == "JOSÉ " || nome == "JOSÉ") {
        println(nome)
    }
}

// Algoritmo 108[cite: 1]
fun alg108() {
    print("Digite nome: ")
    val nome = readLine()!!
    val prenome = nome.take(5).lowercase()
    if (prenome == "josé " || nome.lowercase() == "josé") {
        println(nome)
    }
}

// Algoritmo 109[cite: 1]
fun alg109() {
    print("Digite 1º nome: ")
    val n1 = readLine()!!
    print("Digite 2º nome: ")
    val n2 = readLine()!!
    if (n1 < n2) {
        println("$n1 $n2")
    } else {
        println("$n2 $n1")
    }
}

// Algoritmo 110[cite: 1]
fun alg110() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    if (a == b) {
        println("Iguais")
    } else {
        println("Diferentes")
    }
}

// Algoritmo 111[cite: 1]
fun alg111() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    println("Maior: ${if (a > b) a else b}")
}

// Algoritmo 112[cite: 1]
fun alg112() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    println("Menor: ${if (a < b) a else b}")
}

// Algoritmo 113[cite: 1]
fun alg113() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    if (a < b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}

// Algoritmo 114[cite: 1]
fun alg114() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    if (a > b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}

// Algoritmo 115[cite: 1]
fun alg115() {
    print("Digite valor de x: ")
    val x = readLine()!!.toDouble()
    print("Digite valor de y: ")
    val y = readLine()!!.toDouble()
    if (x > y) {
        println("${sqrt(x)}")
        println("${y.pow(2)}")
    } else if (y > x) {
        println("${sqrt(y)}")
        println("${x.pow(2)}")
    } else {
        println("Números iguais")
    }
}

// Algoritmo 116[cite: 1]
fun alg116() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    val c = readLine()!!.toDouble()
    println("Maior: ${if (a > b && a > c) a else if (b > c) b else c}")
}

// Algoritmo 117[cite: 1]
fun alg117() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    val c = readLine()!!.toDouble()
    var m = a
    if (b > m) m = b
    if (c > m) m = c
    println("Maior: $m")
}

// Algoritmo 118[cite: 1]
fun alg118() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    val c = readLine()!!.toDouble()
    val lista = listOf(a, b, c).sorted()
    println("Ordem crescente: ${lista.joinToString(" ")}")
}

// Algoritmo 119[cite: 1]
fun alg119() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    val c = readLine()!!.toDouble()
    val lista = listOf(a, b, c).sortedDescending()
    println("Ordem decrescente: ${lista.joinToString(" ")}")
}

// Algoritmo 120[cite: 1]
fun alg120() {
    print("Digite 1º número: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º número: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º número: ")
    val c = readLine()!!.toDouble()
    val lista = listOf(a, b, c).sorted()
    println("Maior: ${lista[2]}\nIntermediário: ${lista[1]}\nMenor: ${lista[0]}")
}

// Algoritmo 121[cite: 1]
fun alg121() {
    print("Digite 5 números diferentes: ")
    val n = Array(5) { readLine()!!.toInt() }
    if (n.distinct().size == 5) {
        println("Maior = ${n.maxOrNull()}\nMenor = ${n.minOrNull()}")
    } else {
        println("Os valores devem ser diferentes")
    }
}

// Algoritmo 122[cite: 1]
fun alg122() {
    print("Digite 1º lado: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º lado: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º lado: ")
    val c = readLine()!!.toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        println("Podem ser lados de um triângulo")
    } else {
        println("Não podem ser lados de um triângulo")
    }
}

// Algoritmo 123[cite: 1]
fun alg123() {
    print("Digite 1º lado: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º lado: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º lado: ")
    val c = readLine()!!.toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && a == c) {
            println("Triângulo equilátero")
        } else if (a == b || a == c || b == c) {
            println("Triângulo isósceles")
        } else {
            println("Triângulo escaleno")
        }
    } else {
        println("As medidas não formam um triângulo")
    }
}

// Algoritmo 124[cite: 1]
fun alg124() {
    print("Digite 1º lado: ")
    val a = readLine()!!.toDouble()
    print("Digite 2º lado: ")
    val b = readLine()!!.toDouble()
    print("Digite 3º lado: ")
    val c = readLine()!!.toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        val lados = listOf(a, b, c).map { it.pow(2) }.sorted()
        if (lados[2] == lados[0] + lados[1]) {
            println("Triângulo retângulo")
        } else if (lados[2] > lados[0] + lados[1]) {
            println("Triângulo obtusângulo")
        } else {
            println("Triângulo acutângulo")
        }
    } else {
        println("As medidas não formam um triângulo")
    }
}

// Algoritmo 125[cite: 1]
fun alg125() {
    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()
    if (idade >= 65) {
        println("Maior de 65")
    } else if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}

// Algoritmo 126[cite: 1]
fun alg126() {
    print("Digite valor de X: ")
    val x = readLine()!!.toDouble()
    when {
        x == 5.0 -> println("O número é o 5")
        x == 200.0 -> println("O número é o 200")
        x == 400.0 -> println("O número é o 400")
        x in 500.0..1000.0 -> println("Intervalo 500-1000")
        else -> println("Fora do escopo")
    }
}

// Algoritmo 127[cite: 1]
fun alg127() {
    print("Digite nome: ")
    val nome = readLine()!!
    print("Digite 1ª nota: ")
    val n1 = readLine()!!.toDouble()
    print("Digite 2ª nota: ")
    val n2 = readLine()!!.toDouble()
    val m = (n1 + n2) / 2
    if (m >= 7) {
        println("$nome $m AP")
    } else if (m < 3) {
        println("$nome $m RP")
    } else {
        println("$nome $m PF")
    }
}

// Algoritmo 128[cite: 1]
fun alg128() {
    print("Digite verbo: ")
    val verbo = readLine()!!
    if (verbo.last().uppercase() == "R") {
        when (verbo[verbo.length - 2].uppercase()) {
            "A" -> println("1ª conjugação")
            "E", "O" -> println("2ª conjugação")
            "I" -> println("3ª conjugação")
            else -> println("Não existe verbo com essa terminação")
        }
    } else {
        println("Não é um verbo no infinitivo")
    }
}

// Algoritmo 129[cite: 1]
fun alg129() {
    print("Digite salário: ")
    val salario = readLine()!!.toDouble()
    val desc = when {
        salario <= 600 -> 0.0
        salario <= 1200 -> salario * 0.2
        salario <= 2000 -> salario * 0.25
        else -> salario * 0.30
    }
    println("Desconto: $desc")
}

// Algoritmo 130[cite: 1]
fun alg130() {
    print("Digite valor do produto: ")
    val valor = readLine()!!.toDouble()
    println("Valor de venda: ${if (valor < 20) valor * 1.45 else valor * 1.3}")
}
