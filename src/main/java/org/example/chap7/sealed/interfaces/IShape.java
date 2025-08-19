package org.example.chap7.sealed.interfaces;

public sealed interface IShape permits CircleClass, IQuadrilatere {

}

sealed interface IQuadrilatere extends IShape permits  Parallelogramme{

}

final class Parallelogramme implements IQuadrilatere {

}

final class CircleClass implements IShape {

}