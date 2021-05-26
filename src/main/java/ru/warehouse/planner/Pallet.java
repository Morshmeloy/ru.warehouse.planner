package ru.warehouse.planner;

//По примеру Rack
public class Pallet {
   static int Size;//размер Палета тоесть какой размер товаров может поместиться
   static int Fullness=0;
   static int LimitOFWeight =1500;
   //здесь по идеи я прописал сколько поместиться на палет(объём,масса) товары повышают массу где лимит 1500
    public void Pallet(int lenght,int width){Size=lenght*width;}
    public void FullnessOfRack(int SizeOfProduct){Fullness=Size-SizeOfProduct;}
    public void LimitOfWeight(int weightOfProduct){if(LimitOFWeight-weightOfProduct>0){ LimitOFWeight=LimitOFWeight-weightOfProduct;}}
    public void AddToPallet(int weightOfProduct){if(Fullness+weightOfProduct!=LimitOFWeight){Fullness=Fullness+weightOfProduct;}}

}
