package ru.warehouse.planner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Все публичные методы и конструкторы всех классов текущего приложения необходимо покрыть unit тестами, по примеру текущего класса
public class RackTest {
    @Test
    public void rackTest() {
        Rack rack1 = new Rack(10, 10, 10, 10);
        Rack rack2 = new Rack(20, 20, 20, 20);
        Rack rack3 = new Rack(30, 30, 30, 30);

        assertEquals(10, rack1.getLength());
        assertEquals(100, rack1.square());

        assertEquals(20, rack2.getLength());
        assertEquals(400, rack2.square());

        assertEquals(30, rack3.getLength());
        assertEquals(900, rack3.square());
    }
}
