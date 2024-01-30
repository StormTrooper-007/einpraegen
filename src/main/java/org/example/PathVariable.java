package org.example;

import java.util.Objects;

public class PathVariable {
    private String pathVariable;

    public PathVariable(String pathVariable) {
        this.pathVariable = pathVariable;
    }

    //todo - create a method to check the variable being created for null or illegal entries


    public String getPathVariable() {
        return pathVariable;
    }

    public void setPathVariable(String pathVariable) {
        this.pathVariable = pathVariable;
    }

    @Override
    public String toString() {
        return "PathVariable{" +
                "pathVariable='" + pathVariable + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PathVariable that = (PathVariable) o;
        return Objects.equals(pathVariable, that.pathVariable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathVariable);
    }
}
