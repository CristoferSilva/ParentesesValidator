# Parenteses Validator Problem 

### Description 📌


Implemente uma classe ParentesesValidator que possui o método isValid(String[] characters)
e retorna true caso o vetor characters contenha uma expressão válida e false caso contrário.
Cada character está implementado como uma String. Utilize a sua StackSinglyLinkedList<T>.
Uma expressão é válida se Parenteses “(”abertos devem ser fechados por parênteses “)”, colchetes “[”por colchetes “]”, e chaves “{”por chaves “}”; Por exemplo, as seguintes expressão são válidas:
- “(”, “)”
- “(”, “)”, “[”, “]”, “{”, “}”
- “(”, “[”, “{”, “}”,“]”, “)”

E as seguintes expressões são inválidas:

- “)”
- “(”, “[”, “}”, “]”
- "(", "[","]", ")", "{"
