package com.jhonAlexavila.Biblioteca.Alura.service;

public interface IDataConvertion {
    <T> T convertData(String json, Class<T> clase);
}
