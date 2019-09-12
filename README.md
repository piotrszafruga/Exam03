<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Egzamin 3 - Servlety.

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Utwórz projekt Mavena:
- groupId - **pl.coderslab**
- artifactId - **jee-exam-3**.
3. Wykonaj poniższe polecenia:
```bash
$ cd ~/folderZprojektami/jeeexam3 // użyj własnej lokalizacji
$ git init
$ git remote add origin https://github.com/CodersLab/WAR_JAVA_JEE_Exam_3.git // użyj własnego forka
$ git fetch
$ git branch master origin/master
$ git checkout master

```
**Zwróć szczególną uwagę na adres repozytorium oraz nazwę folderu.**

4. Rozwiąż zadania i skomituj zmiany do swojego repozytorium. Użyj do tego komend `git add nazwa_pliku`.
Jeżeli chcesz dodać wszystkie zmienione pliki użyj `git add *` 
Pamiętaj że kropka na końcu jest ważna!
Następnie skommituj zmiany komendą `git commit -m "nazwa_commita"`
5. Wypchnij zmiany do swojego repozytorium na GitHubie.  Użyj do tego komendy `git push origin master`
6. Stwórz [*pull request*](https://help.github.com/articles/creating-a-pull-request) do oryginalnego repozytorium, gdy skończysz wszystkie zadania.


### Repozytorium może zawierać jedynie katalog `src` oraz pliki: `.gitignore`,`pom.xml`, `README.md` . 
Pozostałe należy dodać do pliku .gitignore, lub pominąć.

Servlety mają się znajdować w pakiecie o nazwie **pl.coderslab.web**. 


#### Pamiętaj, że pull request musi być stworzony, aby wykładowca dostał Twoje odpowiedzi.

* podczas egzaminu **możesz** korzystać z notatek, kodu napisanego wcześniej, internetu i prezentacji,
* zabroniona jest jakakolwiek komunikacja z innymi kursantami oraz osobami na zewnątrz.

**Powodzenia!**

----------------------------------------------------------------------------------------

#### Zadanie 1 (2 pkt)

1. W pliku **index.jsp** napisz link odnoszący się do servletu dostępnego  **/receiver** i przekazujący zmienne metodą **GET**. 
Przekazane zmienne są następujące:
* name = "coder"
* mail = "coder@somemail.com"
* id = 34

2. W pliku **form.jsp** napisz formularz zawierający te same pola oraz kierujący do tego samego servletu
  **/receiver** i przekazujący zmienne metodą **GET**.
   
W servlecie dostępnym pod adresem  **/receiver** napisz kod, który odbierze te zmienne i wyświetli je na ekranie.


#### Zadanie 2 (3 pkt)

1. Utwórz klasę reprezentującą Smerfa o nazwie `Smurf`, 
2. Klasa ma posiadać następujące pola (typu String):
    * name (imię),
    * attribute (atrybut),
    * description (opis).
3. Stwórz klasę `SmurfDao` - a w niej metodę o sygnaturze `List <Smurf> getList()`- metoda ma tworzyć 5 obiektów klasy `Smurf`,
 które następnie doda do ArrayListy. Metoda ma zwrócić listę obiektów.
4. Utwórz servlet dostępny pod adresem `/smurfs`, przekaż do widoku `smurfs.jsp` listę utworzoną przez klasę `SmurfDao`.
5. Wyświetl w tabeli html wszystkie informacje dotyczące smerfów (nie korzystaj z metody `toString()` obiektu).
6. Dodaj link do rozwiązania zadania w pliku `index.jsp` z zadania 1.

#### Zadanie 3 (5 pkt)

1. W servlecie dostępnym pod adresem adresem **/regex/**.
2. Servlet ma korzystać z widoku regex.jsp.
3. W metodzie **doGet** za pomocą wyrażeń regularnych sprawdź czy parametr o nazwie `param1` jest nazwą pliku graficznego spełniającym warunki:
    - składa się tylko z małych liter
    - ma rozszerzenie (gif, jpg, png),
    -  a kropkę przed rozszerzeniem np.: cat.jpg
4. Jeżeli parametr spełnia warunki przekieruj do adresu **https://www.google.pl/#q=cat.jpg** zamieniając `cat.jpg` wartością parametru.
5. Jeżeli parametr nie spełnia warunków wyświetl komunikat: "Niepoprawna nazwa".


#### Zadanie 4 (5 pkt)

1. Utwórz klasę reprezentującą Cytat o nazwie `Quote`, 
2. Klasa ma posiadać następujące pola (typu String):
    * author (imię i nazwisko autora),
    * content (zawartość).
3. Pod adresem **/addquote** wyświetl formularz umożliwiający dodawanie nowego cytatu. Cytaty zapisuj w sesji.
4. Pod adresem **/allquotes** - wyświetl tabelę html ze wszystkimi cytatami, które znajdują się w sesji. 
Wyświetlaj zawartość cytatu oraz autora.
5. W servlecie dostępnym pod adresem **/randomquote** napisz kod, który wyświetli na stronie jsp losowy cytat zapisany w sesji.    
6. Dodaj link do rozwiązania zadania w pliku `index.jsp` z zadania 1.

#### Zadanie 5 (5 pkt)

1. Utwórz servlet oraz stronę jsp dostępną pod adresem **/homepage**.
2. Na stronie wyświetl informację że korzysta ona z ciasteczek w postaci:
```
Informujemy, że ta strona korzysta z plików cookies. 
```
3. Na stronie umieść link z możliwością akceptacji plików cookies.
4. Po kliknięciu w link akceptacji plików cookies oraz odświeżeniu strony informacja nie powinna się pojawiać.
5. Informację o akceptacji plików cookies zapisz w ciasteczku. 
6. Dodaj link do rozwiązania zadania w pliku `index.jsp` z zadania 1.

<!-- Links -->
[lorem-ipsum]: http://pl.lipsum.com/
