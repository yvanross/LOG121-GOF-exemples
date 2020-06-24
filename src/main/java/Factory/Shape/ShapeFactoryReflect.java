package Factory.Shape;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import Decorateur.Shapes.Shape;

public class ShapeFactoryReflect {
  private static ShapeFactoryReflect instance = null;

  private ShapeFactoryReflect() {
  };

  public Shape getShape(final String name) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
      InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    final Class<?> shapeClass = Class.forName("Decorateur.Shapes.Circle");
    final Constructor<?> constructor = shapeClass.getConstructor();
    final Shape shape = (Shape) constructor.newInstance();
    return shape;
  }

  public static ShapeFactoryReflect getInstance() {
    if (instance == null)
      instance = new ShapeFactoryReflect();

    return instance;
  }

}
