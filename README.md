# 🛒 Java Inheritance Shop

A simple Java console project demonstrating Object-Oriented Programming (OOP) concepts such as inheritance, encapsulation, and dynamic array management, simulating a small electronics shop.

## 📁 Project Structure

```
java-inheritance-shop/
├── src/
│   ├── Carrello.java
│   ├── Main.java
│   ├── Prodotto.java
│   ├── Smartphone.java
│   ├── Televisori.java
│   ├── Cuffie.java
├── README.md
```

## 🏷️ Main Classes

### `Prodotto.java`
- Base class for all products.
- Fields: code, name, brand, price, VAT.
- Methods: getters/setters, price calculation with VAT, `toString()`.

### `Smartphone.java`
- Extends `Prodotto`.
- Additional fields: IMEI code, memory capacity.
- Methods: getters/setters, `toString()`.

### `Televisori.java`
- Extends `Prodotto`.
- Additional fields: width, height, depth, smart.
- Methods: getters/setters, print measurements, `toString()`.

### `Cuffie.java`
- Extends `Prodotto`.
- Additional fields: colour, wireless.
- Methods: getters/setters, `toString()`.

### `Carrello.java`
- Allows the user to add products to the cart via an interactive menu.
- Manages a dynamic array of products.
- Prints the cart contents.

### `Main.java`
- Examples of using the classes (`Smartphone`, `Televisori`, `Cuffie`).

## ⚙️ How to Compile and Run

### Compile

```bash
cd src
javac *.java
```

### Run

To start the interactive cart:
```bash
java Carrello
```

To run basic examples:
```bash
java Main
```

## 👨‍💻 Author

[@Mattia Zecchinato](https://github.com/MattiaZecchinato)
