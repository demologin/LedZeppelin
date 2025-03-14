package com.javarush.led.module01.lesson16;

public class Data {
    public static final String TEXT= """
            Коротко о главном — Java Collections Framework
            Статья из группы Random
            558027 участников
            Начало пути
            Сегодня хотелось бы поговорит про такую интересную тему, как "Java Collections Framework" или говоря простым языком — про коллекции.
                        
            Большая часть работы кода — это обработка данных в том или ином виде. Получить список пользователей, получить список адресов и т.д. Как-то их отсортировать, выполнить поиск, сопоставить. Именно поэтому знание коллекций считается одним из основных навыков. Именно поэтому хочется поговорить про это. Кроме того, одними из самых частых вопросов на собеседованиях на Java разработчика являются коллекции. Например, "нарисуйте иерархию коллекций".
                        
            Поможет нам на нашем пути онлайн компилятор. Например, можно использовать "Tutorialspoint Online Java Compiler"  или Repl.it.
                        
            Путь знакомства с любыми структурами данных начинается с обычных переменных (Variables). На сайте Oracle различные темы представлены как "пути" или Trail. Так, путь знакомства с Java называется "Trail: Learning the Java Language: Table of Contents". И основы языка (т.е. Language Basics) начинаются с Variables. Поэтому, напишем простенький код:
                        
            public static void main(String[] args) {
            	String user = "Max";
            	System.out.println("Hello, " + user);
            }
                        
            Он всем хорош, кроме того, что мы понимаем, что данный код хорош и красив только для одной переменной. Что делать, если их несколько?
                        
            Для хранения данных одного типа придумали массивы (Arrays). В том самом Trail от Oracle есть отдельный раздел, посвящённый массивам. Этот раздел так и называется: "Arrays".
                        
            Работа с массивами тоже довольно проста:
                        
            import java.util.Arrays;
            class Main {
              public static void main(String[] args) {
                String[] users = new String[2];
                users[0] = "Max";
                users[1] = "John";
                System.out.println("Hello, " + Arrays.toString(users));
              }
            }
                        
            Массивы решают проблему с хранением нескольких значений в одном месте. Но накладывает ограничение: размер массива постоянен. Если, как в примере, мы сказали что размер = 2, значит он равен двум. И всё. Если мы хотим массив больше — нам нужно создать новый экземпляр. Кроме того, поиск элемента — тоже сложная вещь для массива. Есть метод Arrays.binarySearch, но данный поиск работает только на сортированном массиве (для несортированного массива результат неопределён или попросту непредсказуем). То есть поиск нас будет обязывать каждый раз сортировать.
                        
            Удаление — тоже лишь очищает значение. Поэтому мы ещё и не знаем, сколько в массиве реально данных, знаем только сколько ячеек в массиве.
                        
            Чтобы освежить знания про массивы:
            "JavaRush: Массивы в Java"
            "The Java Tutorial: Arrays"
            И как следствие развития языка Java в JDK 1.2 появился Java Collections Framework, о котором мы и будем сегодня говорить.
            Коротко о главном — Java Collections Framework - 2
            Collection
            Начать стоить с самого начала. Почему коллекции (Collection)?
                        
            Сам термин берёт своё начало из таких вещей, как "Теория типов" и "Абстрактные типы данных".
                        
            Но если не смотреть на какие-то высокие материи, то когда у нас несколько вещей, то мы можем назвать их "коллекция вещей". Те, кто собирают предметы. Вообще само слово коллекционировать происходит от лат. collectio «собирание, сбор». То есть коллекция — это сбор чего-то, контейнер для каких-то элементов.
                        
            Итак, у нас есть коллекция элементов. Что мы можем захотеть с ней делать:
            Коротко о главном — Java Collections Framework - 3
            Как видно, мы можем захотеть довольно логичные вещи. А ещё мы понимаем, что мы можем захотеть что-то делать с несколькими коллекциями:
            Коротко о главном — Java Collections Framework - 4
            Соответственно, для описание такого общего поведения для всех коллекций написали разработчики Java интерфейс java.util.Collection.
                        
            Интерфейс Collection — это то место, откуда берут начало все коллекции. Collection — это идея, это представление о том, как должны себя вести все коллекции. Поэтому, термин "Коллекция" выражена в виде интерфейса. Естественно, интерфейсу нужны реализации.
                        
            Интерфейс java.util.Collection имеет абстрактный класс AbstractCollection, то есть некоторая "абстрактная коллекция", которая представляет собой скелет для остальных реализаций (о чём написано в JavaDoc над классом java.util.AbstractCollection).
                        
            Говоря о коллекциях вернёмся ещё раз вспомним, что мы хотим итерироваться по ним. Это значит, что мы хотим перебирать элементы один за другим. Это очень важная концепция. Поэтому, интерфейс Collection наследуется от Iterable. Это очень важно, т.к. во-первых, всё что Iterable должно уметь возвращать Iterator по своему содержимому. А во-вторых, всё что Iterable может использоваться в циклах for-each-loop. И именно при помощи итератора в AbstractCollection реализованы такие методы, как contains, toArray, remove. И путь к познанию коллекций начинается с одной из самых распространённых структур данных — списка, т.е. List.
                        
            Коротко о главном — Java Collections Framework - 5
            Списки (List)
            Итак, списки занимают важное место в иерархии коллекций:
            Коротко о главном — Java Collections Framework - 6
            Как мы видим, списки реализуют интерфейс java.util.List.
                        
            Списки выражают то, что у нас есть коллекция элементов, которые расположены в некоторой последовательности друг за другом. Каждый элемент имеет индекс (как в массиве). Как правило, список позволяет иметь элементы с одинаковым значением.
                        
            Как мы уже сказали выше, List знает про индекс элемента. Это позволяет получить (get) элемент по индексу или задать значением для определённого индекса (set). Методы коллекций add, addAll, remove позволяют указать индекс, с которого необходимо их выполнять. Кроме того, у List есть своя версия итератора, которая называется ListIterator. Этот итератор знает про индекс элемента, поэтому он умеет итерироваться не только вперёд, но и назад. Его даже можно создать от определённого места в коллекции.
                        
            Среди всех реализаций можно выделить две самые часто используемые: ArrayList и LinkedList. Во-первых, ArrayList — это список (List) на основе массива (Array). Это позволяет добиться "Произвольного доступа" (Random Access) к элементам. Произвольный доступ — это возможность сразу достать элемент по индексу, а не перебирать все элементы, пока не найдём элемент с нужным индексом. Именно массив как основа позволяет этого достичь.
                        
            Напротив, LinkedList — это связанный (Linked) список (List). Каждая запись в связанном списке представлена в виде Entry, которая хранит сами данные, а так же ссылку на следующую (next) и предыдущую (previous) Entry. Таким образом LinkedList реализует "Последовательный доступ" (Sequential Access).\s
            Понятно, что чтобы найти 5-тый элемент нам придётся пройти от первого элемента до последнего, т.к. у нас нет напрямую доступа к пятому элементу. Мы можем получить к нему доступ только от 4-го элемента.
                        
            Разница в их концепции приведена ниже:
            Коротко о главном — Java Collections Framework - 7
            В работе, как Вы понимаете, тоже есть разница. Например, добавление элементов. В LinkedList элементы просто связываются, как звенья в цепи. Но вот ArrayList хранит элементы в массиве. А массив, как мы знаем, не может изменять свой размер. Как же работает тогда ArrayList?
                        
            А работает он очень просто. Когда заканчивается место в массиве, то он увеличивается в 1.5 раза. Вот код увеличения:
                        
            int newCapacity = oldCapacity + (oldCapacity >> 1);
                        
            Другим отличием в работе является любое смещение элементов. Например, при добавлении в середину или удалении элементов. Чтобы удалить из LinkedList элемент достаточно убрать ссылки на этот элемент. В случае же с ArrayList мы вынуждены сдвигать каждый раз элементы при помощи метода System.arraycopy. Таким образом, чем больше элементов, тем больше действий придётся совершить.
                        
            Более подробное описание можно прочитать в данных статьях:
            "Структуры данных в картинках. ArrayList"
            "Структуры данных в картинках. LinkedList"
            "Что под капотом у LinkedList?"
            Рассмотрев ArrayList нельзя не вспомнить про его "предшественника", про класс java.util.Vector. Отличается Vector от ArrayList тем, что методы для работы с коллекцией (добавление, удаление и т.д.) синхронизированы. То есть если один поток (Thread) будет добавлять элементы, то другие потоки будут ждать, пока первый поток не закончит свою работу. Так как потокобезопасность зачастую не требуется, рекомендуется использовать в таких случаях класс ArrayList, о чём прямым текстом сказано в JavaDoc для класса Vector.\s
                        
            Кроме того, Vector увеличивает свой размер не в 1.5 раза, как ArrayList, а в 2 раза. В остальном поведение такое же — за Vector скрывается хранилище элементов в виде массива и добавление/удаление элементов имеют те же последствия, что и в ArrayList.
                        
            На самом деле, про Vector мы вспомнили не просто так. Если посмотреть в Javadoc, то мы увидим в "Direct Known Subclasses" такую структуру, как java.util.Stack.
                        
            Стэк — это интересная структура, которая является LIFO структурой last-in-first-out (последним пришёл, первым ушёл). Стэк в переводе с английского — стопка (как стопка книг, например). Стэк реализует дополнительные методы: peek (взглянуть, посмотреть), pop (вытолкнуть), push (затолкать).
                        
            Метод peek переводится как взглянуть (например, peek inside the bag переводится как "заглянуть внутрь мешка", а peek through the keyhole переводится как "подглядывать в замочную скважину"). Данный метод позволяет посмотреть "на вершину" стэка, т.е. получить последний элемент не снимая (т.е. не удаляя) его из стэка.
                        
            Метод push заталкивает (добавляет) в стэк новый элемент и возвращает его же, а метод pop элемент выталкивает (удаляет) и возвращает удалённый. Во всех трёх случаях (т.е. peek, pop и push) мы работаем только с последним элементом (т.е. с "вершиной стэка"). В этом основная особенность структуры стэк.
                        
            Кстати, на понимание стэков есть интересная задача, описанная в книге "Карьера программиста" (Cracking Coding Interview) есть интересная задача, где используя структуру "стэк" (LIFO) нужно реализовать структуру "очередь" (FIFO). Выглядеть это следующим образом:
            Коротко о главном — Java Collections Framework - 8
            Разбор этой задачи можно посмотреть тут: "Implement A Queue Using Stacks — The Queue ADT ("Implement Queue Using Stacks" on LeetCode)". Вот мы плавно и переходим к новой структуре данных — очередь.
            Коротко о главном — Java Collections Framework - 9
            Очередь (Queue)
            Очередь (Queue) — это структура, знакомая нам из жизни. Очереди в магазины, к врачам. Кто первее пришёл (First In), тот первее и выйдет из очереди (First Out). В Java очередь представлена интерфейсом java.util.Queue.
                        
            Согласно Javadoc очереди, очередь добавляет следующие методы:
            Коротко о главном — Java Collections Framework - 10
            Как видите, есть методы-приказы (их невыполнение чревато исключением) и есть методы-просьбы (невозможность их выполнить не приводит к ошибкам). Кроме того, можно получить элемент без удаления (peek или элемент).
                        
            У интерфейса очереди есть так же полезный наследник — Deque. Это так называемая "двусторонняя очередь". То есть такая очередь позволяет использовать эту структуру как с начала, так и с конца. В документации сказано, что "Deques can also be used as LIFO (Last-In-First-Out) stacks. This interface should be used in preference to the legacy Stack class.", то есть вместо Stack рекомендуется использовать реализации Deque.
                        
            В Javadoc показано, какие методы описывает интерфейс Deque:
            Коротко о главном — Java Collections Framework - 11
            Давайте посмотрим, какие есть реализации. И увидим интересный факт — в стан очередей "затесался" LinkedList ) То есть LinkedList реализует интерфейс как List, так и Deque.
                        
            Но есть и "только очереди", например PriorityQueue. Про неё не часто вспоминают, а зря. Во-первых, в этой очереди нельзя использовать "non-comparable objects", т.е. должен быть или Comparator указан или все объекты должны быть comparable. Во-вторых, "this implementation provides O(log(n)) time for the enqueuing and dequeuing methods". Логарифмическая сложность тут не просто так.
                        
            Реализована PriorityQueue на основе "кучи". В Javadoc сказано: "Priority queue represented as a balanced binary heap". Само же хранилище для этого — обычный массив. Который растёт при необходимости. Когда куча небольшая — в 2 раза увеличивается. А потом на 50%. Комментарий из кода: "Double size if small; else grow by 50%".
                        
            Очередь с приоритетом и Binary Heap — отдельная тема. Поэтому для дополнительной информации:
            Супер статья на хабре: "Структуры данных. Неформальный гайд"
            Понятное объяснение про "кучу": "Фоксфорд: Информатика. Структуры данных: Куча (heap)"
            Статья с хабра про Binary Heap: "Структуры данных: двоичная куча (binary heap)"
            "Introduction to Binary Heaps (MaxHeaps)"
            В качестве реализации java.util.Deque можно привести класс java.util.ArrayDeque. То есть списки можно реализовать при помощи связанного списка и массива и очереди тоже можно реализовать при помощи массива или при помощи связанного списка.
                        
            Интерфейсы Queue и Deque имеют наследников, представляющих "блокирующую очередь": BlockingQueue и BlockingDeque.
                        
            Вот изменение интерфейса в сравнении с обычными очередями:
            Коротко о главном — Java Collections Framework - 12
            Давайте посмотрим на какие-нибудь примеры блокирующих очередей. А они ведь интересные. Например, BlockingQueue реализуют: PriorityBlockingQueue, SynchronousQueue, ArrayBlockingQueue, DelayQueue, LinkedBlockingQueue.
                        
            А вот BlockingDeque реализуют из стандартного Collection Frameworks всего LinkedBlockingDeque. Каждая очередь — тема отдельного обзора. А в рамках данного обзора изобразим иерархию классов не только с List, но и с Queue:
            Коротко о главном — Java Collections Framework - 13
            Как мы видим из схемы, интерфейсы и классы Java Collections Framework сильно переплетены. Давайте добавим ещё одну ветвь иерархии — Set.
            Коротко о главном — Java Collections Framework - 14
            Set
            Set — переводится как "набор". От очереди и списка Set отличается большей абстракцией над хранением элементов. Set — как мешок с предметами, где неизвестно, как лежат предметы и в каком порядке они легли.
                        
            В Java такой набор представлен интерфейсом java.util.Set.
                        
            Как сказано в документации, Set — это "collection that contains no duplicate elements". Интересно, что сам интерфейс Set не добавляет новых методов к интерфейсу Collection, а лишь уточняет требования (про то, что не должно содержать дубликатов). Кроме того, из прошлого описания следует, что просто так из Set нельзя получить элемент. Для получения элементов используется Iterator.
                        
            Set имеет ещё несколько связанных с собой интерфейсов. Первый это SortedSet. Как и следует из названия, SortedSet указывает на то, что такой набор отсортирован, а следовательно элементы реализуют интерфейс Comparable или указан Comparator.
                        
            Кроме того, SortedSet предлагает несколько интересных методов:
            Коротко о главном — Java Collections Framework - 15
            Кроме того, есть методы first (самый маленький по значению элемент) и last (самый большой по значению элемент).
                        
            У SortedSet есть наследник — NavigableSet. Цель этого интерфейса — описать методы навигации, которые нужны для более точного определения подходящих элементов. Из интересного — NavigableSet добавляет к привычному iterator (который идёт от меньшего к большему) итератор для обратного порядка —  descendingIterator. Кроме того, NavigableSet позволяет при помощи метода descendingSet получить вид на себя (View), в котором элементы идут в обратном порядке. Это называется View, потому что через полученный элемент можно изменять элементы изначального Set. То есть по сути это представление изначальных данных другим способом, а не их копия.
                        
            Интересно, что NavigableSet, подобно Queue, умеет pollFirst (минимальный) и pollLast (максимальный) элементы. То есть получает этот элемент и убирает из набора. Какие же есть реализации?\s
                        
            Во-первых, самая известная реализация — на основе хэш-кода — HashSet.
            Другая не менее известная реализация — на основе красно-чёрного дерева — TreeSet.
                        
            Давайте дорисуем нашу схему:
            Коротко о главном — Java Collections Framework - 16
            В рамках коллекций осталось разобрать иерархию — отшельников. Которая на первый взгляд стоит в стороне — java.util.Map.
            Коротко о главном — Java Collections Framework - 17
            Карты (Map)
            Карты — это такая структура данных, в которой данные хранятся по ключу. Например, ключом может служить ID или код города. И именно по этому ключу будут искаться данные.
                        
            Интересно, что карты вынесены отдельно. По словам разработчиков (см. "Java Collections API Design FAQ") маппинг "ключ - значение" не является коллекцией. И карты можно скорей представить как коллекция ключей, коллекция значений, коллекция пар "ключ - значение". Вот такой вот интересный зверь.
                        
            Какие же методы предоставляют карты? Давайте посмотрим на Java API интерфейса java.util.Map.
                        
            Т.к. карты не являются коллекциями (не наследуются от Collections), то они не содержат метод contains. И это ведь логично. Карта состоит из ключей и значений. Что из этого должен проверять метод contains и как не запутаться? Поэтому, интерфейс Map имеет две разные версии: containsKey (содержит ли ключ) и containsValue (содержит ли значение).
                        
            При помощи keySet позволяет получить набор ключей (тот самый Set). А при помощи метода values можем получить коллекцию значений в карте. Ключи в карте уникальны, что подчёркивается структурой данных Set. Значения же могут повторяться, что подчёркивает стуктура данных Collection.
                        
            Кроме того, при помощи метода entrySet можем получить набор пар "ключ - значение".
                        
            Подробнее про то, какие реализации карт есть можно прочитать в самых подробных разборах:
            "Структуры данных в картинках. HashMap"
            "Структуры данных в картинках. LinkedHashMap"
            "Внутренняя работа HashMap в Java (upd для Java 8)"
            Хотелось бы ещё увидеть, что HashMap очень похож на HashSet, а TreeMap на TreeSet. У них даже схожие интерфейсы: NavigableSet и NavigableMap, SortedSet и SortedMap.\s
                        
            Итак, наша финальная карта будет выглядеть следующим образом:
            Коротко о главном — Java Collections Framework - 18
            Закончить можно занимательным фактом, что коллекция Set внутри себя использует Map, где добавляемые значения — это ключи, а значение везде одинаковое. Занимательно это потому, что Map не является коллекцией и возвращает Set, который является коллекцией, но по факту реализован как Map. Немного сюр, но вот так вот вышло )
            Коротко о главном — Java Collections Framework - 19
            Заключение
            Хорошая новость — на этом данный обзор заканчивается. Плохая новость — это очень обзорная статья. Каждая реализация каждой из коллекций заслуживает отдельную статью, а ещё на каждый скрытый от наших глаз алгоритм. Но цель данного обзора - вспомнить, какие они есть и какие связи между интерфейсами. Надеюсь, у Вас получится после вдумчивого прочтения нарисовать по памяти схему коллекций.
                        
                        
                        
            Ну и по традиции немного ссылок:
            "Oracle Trail: Collections"
            "IBM Tutorial: Java Collections"
            "Юрий Ткач: Advanced Java - Collections"
            "Java Collections: The Force Awakens by Raoul-Gabriel Urma and Richard Warburton"
            "Тимур Батыршинов: 22 - Основы java. Коллекции (и следующие видео из PlayList)"
            "Пять вещей, которых вы не знали о... the Java Collections API"
            
            """;
}
