package com.acarajecorp.sbfipe.application;

import com.acarajecorp.sbfipe.model.Data;
import com.acarajecorp.sbfipe.model.Models;
import com.acarajecorp.sbfipe.service.ConsumeAPI;
import com.acarajecorp.sbfipe.service.ConvertData;

import java.util.Comparator;
import java.util.Scanner;

public class Program {
    private Scanner sc = new Scanner(System.in);
    private ConsumeAPI consumeAPI = new ConsumeAPI();
    private ConvertData converter = new ConvertData();

    private final String BASE_URL = "https://parallelum.com.br/fipe/api/v1/";

    public void showMenu(){
        var menu = """
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consulta:
                """;

        System.out.println(menu);
        var option = sc.nextLine();
        String apiUrl;

        if (option.toLowerCase().contains("carr")) {
            apiUrl = BASE_URL + "carros/marcas";
        } else if (option.toLowerCase().contains("mot")) {
            apiUrl = BASE_URL + "motos/marcas";
        } else {
            apiUrl = BASE_URL + "caminhoes/marcas";
        }

        var json = consumeAPI.getData(apiUrl);
        System.out.println(json);

        var carBrands = converter.getList(json, Data.class);
        System.out.println(carBrands);
        carBrands.stream()
                .sorted(Comparator.comparing(Data::carCode))
                .forEach(System.out::println);

        System.out.println("Informe o código da marca para consulta: ");
        var brandCode = sc.nextLine();

        apiUrl += "/" + brandCode + "/modelos";
        json = consumeAPI.getData(apiUrl);
        var listModel = converter.getData(json, Models.class);

        System.out.println("\nModelos dessa marca: ");
        listModel.models().stream()
                .sorted(Comparator.comparing(Data::carCode))
                .forEach(System.out::println);
    }
}
