package exercise_4;

import java.util.Scanner;

/**
 * Завдання 4
 * Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас DocumentWorker. У тілі класу створіть три
 * методи openDocument(), editDocument(), saveDocument(). У тілі кожного з методів додайте виведення на екран
 * відповідних рядків: "Документ відкритий", "Правка документа доступна у версії Про", "Збереження документа
 * доступне у версії Про". Створіть похідний клас ProDocumentWorker. Перевизначте відповідні методи, при
 * перевизначенні методів виводьте наступні рядки: "Документ відредаговано", "Документ збережено у старому
 * форматі, збереження в інших форматах доступне у версії Експерт". Створіть похідний клас ExpertDocumentWorker
 * від базового класу ProDocumentWorker. Перевизначте відповідний метод. При викликі даного методу необхідно
 * виводити на екран документ збережений в новому форматі. У тілі методу main() реалізуйте можливість прийому
 * від користувача номер ключа доступу pro і exp. Якщо користувач не вводить ключ, він може користуватися тільки
 * безкоштовною версією (створюється екземпляр базового класу), якщо користувач ввів номери ключа доступу pro і
 * exp, то повинен створити екземпляр відповідної версії класу, наведений до базового – DocumentWorker.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ключ продукту: _");
        int key = scanner.nextInt();

        if (key >= 1000 && key < 10000) {
            System.out.println("Вам доступна Pro версія DocumentWorker");
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.openDocument();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();
        } else if (key >= 100000 && key <1000000) {
            System.out.println("Вам доступна Expert версія DocumentWorker");
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            expertDocumentWorker.openDocument();
            expertDocumentWorker.editDocument();
            expertDocumentWorker.saveDocument();
        } else {
            System.out.println("Ви ввели невірний ключ продукту. Вам доступна безкоштовна версія DocumentWorker");
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }
    }
}
