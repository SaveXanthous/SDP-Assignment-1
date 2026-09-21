# Assignment 1
**Student:** Zhumatayev Diyar

**Group** SE-2517

---

### What were the specific design problems in your initial constructor-based implementation?

It is inconvenient to enter the parameters.

### Why is the Builder pattern justified for your specific domain?

intuitive parameter input

### Did you implement a Director class? If yes, how does it improve your design? If no, why did you decide it wasn't necessary?

Ready-made, convenient presets

### Is your final Product immutable? Why did you make this design decision?

Why change the product—what it actually is?

### Can your Builder instance be reused to create multiple different objects? Why or why not?

Yes, class

### Where exactly did you place your validation logic, and why did you choose this location?

Init, simple

### How did you implement cross-field validation?

```java
else if(builder.language_layout == builder.adtional_language_layout) {
    throw new IllegalArgumentException("Primary and additional language layouts cannot be the same.");
} else if ((builder.language_layout == "jp" || builder.adtional_language_layout == "jp") && builder.region != "JIS") {
    throw new IllegalArgumentException("Japanese layout requires JIS region.");
} 
```