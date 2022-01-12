package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Cell dest = Cell.A1;
        Figure bishop = new BishopBlack(dest);
        Assert.assertEquals(dest, bishop.position());
    }

    @Test
    public void testWay() {
        Figure bishop = new BishopBlack(Cell.C1);
        Cell dest = Cell.G5;
        Cell[] actual = bishop.way(dest);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testWayExceptionCaught() {
        Figure bishop = new BishopBlack(Cell.C1);
        Cell dest = Cell.G6;
        Cell[] actual = bishop.way(dest);
    }

    @Test
    public void testCopy() {
        Figure bishop = new BishopBlack(Cell.B6);
        Cell dest = Cell.A5;
        Figure bishopNew = bishop.copy(dest);
        Assert.assertEquals(dest, bishopNew.position());
    }

}