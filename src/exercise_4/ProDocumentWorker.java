package exercise_4;

public class ProDocumentWorker extends DocumentWorker{

    @Override
    void editDocument() {
        System.out.println("Документ відредаговано");
    }
    @Override
    void saveDocument() {
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
}