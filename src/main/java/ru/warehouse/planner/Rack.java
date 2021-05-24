package ru.warehouse.planner;

public class Rack {
    static int Size;//размер стелажа
    static int Fullness=0;
    static int LimitOfShelf;
    static int NumbersOfShelfs;
    static int LimitOfRack;
//Здесь хочу выбор высоты палета чтобы вставлять количество полок но ведь их можно делать одни больше другие меньше и из различных материалов тоесть лимит прочности разный
    public void Rack(int Hight,int Lenght,int Fullness,int NumbersOfShelfs){
        Size=Lenght*Hight;
        Size=this.Size;
        Fullness=this.Fullness;
        NumbersOfShelfs=this.NumbersOfShelfs;
    }
    public void AddToRack(int weightOfProduct){if(Fullness+weightOfProduct!=LimitOfRack){Fullness=Fullness+weightOfProduct;}}
}
