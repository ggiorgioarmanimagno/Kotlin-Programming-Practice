//Write a kotlin program that will read in month and day
// (as numerical value).
// The program will return the equivalent zodiac sign.

fun main() {
    print("Enter month: ")
    var month = readLine()?.toInt()

    print("Enter day: ")
    var day = readLine()?.toInt()

    if (month != null && day != null) {
        if (month == 1 && day >= 20 && day <= 31) {
            println("Zodiac sign for January $day is Aquarius")
        } else if (month == 2 && day >= 1 && day <= 18) {
            println("Zodiac sign for February $day is Aquarius")
        } else if (month == 2 && day >= 19 && day <= 29) {
            println("Zodiac sign for February $day is Pisces")
        } else if (month == 3 && day >= 1 && day <= 20) {
            println("Zodiac sign for March $day is Pisces")
        } else if (month == 3 && day >= 21 && day <= 31) {
            println("Zodiac sign for March $day is Aries")
        } else if (month == 4 && day >= 1 && day <= 19) {
            println("Zodiac sign for April $day is Aries")
        } else if (month == 4 && day >= 20 && day <= 30) {
            println("Zodiac sign for April $day is Taurus")
        } else if (month == 5 && day >= 1 && day <= 20) {
            println("Zodiac sign for May $day is Taurus")
        } else if (month == 5 && day >= 21 && day <= 31) {
            println("Zodiac sign for May $day is Gemini")
        } else if (month == 6 && day >= 1 && day <= 20) {
            println("Zodiac sign for June $day is Gemini")
        } else if (month == 6 && day >= 21 && day <= 30) {
            println("Zodiac sign for June $day is Cancer")
        } else if (month == 7 && day >= 1 && day <= 22) {
            println("Zodiac sign for July $day is Cancer")
        } else if (month == 7 && day >= 23 && day <= 31) {
            println("Zodiac sign for July $day is Leo")
        } else if (month == 8 && day >= 1 && day <= 22) {
            println("Zodiac sign for August $day is Leo")
        } else if (month == 8 && day >= 23 && day <= 31) {
            println("Zodiac sign for August $day is Virgo")
        } else if (month == 9 && day >= 1 && day <= 22) {
            println("Zodiac sign for September $day is Virgo")
        } else if (month == 9 && day >= 23 && day <= 30) {
            println("Zodiac sign for September $day is Libra")
        } else if (month == 10 && day >= 1 && day <= 22) {
            println("Zodiac sign for October $day is Libra")
        } else if (month == 10 && day >= 23 && day <= 31) {
            println("Zodiac sign for October $day is Scorpio")
        } else if (month == 11 && day >= 1 && day <= 21) {
            println("Zodiac sign for November $day is Scorpio")
        } else if (month == 11 && day >= 22 && day <= 30) {
            println("Zodiac sign for November $day is Sagittarius")
        } else if (month == 12 && day >= 1 && day <= 21) {
            println("Zodiac sign for December $day is Sagittarius")
        } else if (month == 12 && day >= 22 && day <= 31){
            println("Zodiac sign for December $day is Capricorn")
        } else if (month == 1 && day >= 1 && day <= 19) {
            println("Zodiac sign for January $day is Capricorn")
        } else {
            println("Invalid Input")
        }
    } else {
        println("Invalid Input")
    }
}
