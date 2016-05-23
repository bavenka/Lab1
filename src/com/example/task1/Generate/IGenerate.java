package com.example.task1.Generate;

/**
 * A parameterized interface, through which
    * declared method where given type and return type
   * values are indicated as parameters
 */
public interface IGenerate<T,V> {
    /** The function that implements 1 of 3 reports
     * @param params-report description
     * @return Returns the value of the annual report required
     */
    public T generate(V params);
}
