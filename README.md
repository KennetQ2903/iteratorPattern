
# Diagrama de Clases

![Diagrama de clases](public/iteratorPattern.png)

# Diagrama de Secuencia

```mermaid
sequenceDiagram
    participant client as Client
    participant collection as BookCollection
    participant iterator as BookIterator
    participant book as Book

    client->>collection: createIterator()
    collection->>iterator: new BookIterator(books[])
    iterator-->>client: return iterator

    loop Iterating
        client->>iterator: hasNext()
        iterator-->>client: return true/false

        alt hasNext is true
            client->>iterator: next()
            iterator->>book: return Book
            iterator-->>client: return Book
        end
    end
```