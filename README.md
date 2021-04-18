# Jetbrains Academy - Coffee Machine

My solutions for the Jetbrains Academy Problem Coffee Machine

https://hyperskill.org/projects/67

The solution is build up step by step over several stages. 
Stage 1 is the first and simple one. The following stages 
build up on the previous stages and get more and more advanced.
There are six stages in total.

Because each stage is completely independent of the previous one,
IntelliJ might show some warnings about duplicated code between 
the stages.

## Stage 1/6

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/67/stages/360/implement)

Just some basic output.

just execute this:

    gradle -PmainClass=stage1.MainKt run --console=plain
    
    Starting to make a coffee
    Grinding coffee beans
    Boiling water
    Mixing boiled water with crushed coffee beans
    Pouring coffee into the cup
    Pouring some milk into the cup
    Coffee is ready!

## Stage 2/6

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/67/stages/361/implement)

We can calculate the ingredients for a given number of cups of coffee.

just execute this:

    gradle -PmainClass=stage2.MainKt run --console=plain
    
    Write how many cups of coffee you will need:
    3
    For 3 cups of coffee you will need:
    600 ml of water
    150 ml of milk
    45 g of coffee beans    

## Stage 3/6

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/67/stages/362/implement)

We can enter all ingredients and calculate if we can make the desired number of cups of coffee.

just execute this:

    gradle -PmainClass=stage3.MainKt run --console=plain
    
    Write how many ml of water the coffee machine has:
    1000
    Write how many ml of milk the coffee machine has:
    300
    Write how many grams of coffee beans the coffee machine has:
    250
    Write how many cups of coffee you will need:
    14
    No, I can make only 5 cups of coffee    

## Stage 4/6

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/67/stages/363/implement)

Now we add a menu for the user to interact with the coffee machine. He can
* fill new ingredients
* buy a cup of coffee
* take out money

We also add different kinds of coffee: espresso, latte and cappuccino

just execute this:

    gradle -PmainClass=stage4.MainKt run --console=plain
    
    The coffee machine has:
    400 of water
    540 of milk
    120 of coffee beans
    9 of disposable cups
    550 of money
    
    Write action (buy, fill, take): fill
    Write how many ml of water do you want to add: 100
    Write how many ml of milk do you want to add: 0
    Write how many grams of coffee beans do you want to add: 250
    Write how many disposable cups of coffee do you want to add: 10
    The coffee machine has:
    500 of water
    540 of milk
    370 of coffee beans
    19 of disposable cups
    550 of money

## Stage 5/6

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/67/stages/364/implement)

We add a loop so the user can do several actions until he enters _exit_.

just execute this:

    gradle -PmainClass=stage5.MainKt run --console=plain

    Write action (buy, fill, take, remaining, exit): remaining
    The coffee machine has:
    400 of water
    540 of milk
    120 of coffee beans
    9 of disposable cups
    550 of money
    
    Write action (buy, fill, take, remaining, exit): exit

## Stage 6/6

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/67/stages/365/implement)

No new features, same as previous stage. Stage was used to improve refactor code.

just execute this:

    gradle -PmainClass=stage6.MainKt run --console=plain 
