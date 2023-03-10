package com.juaracoding.cucumber.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
        		"src/main/resources/features/01.Login.feature",
        		"src/main/resources/features/02.AbsenMasuk.feature",
                "src/main/resources/features/03.AbsenPulang.feature",
                "src/main/resources/features/04.AbsenSakit.feature",
                "src/main/resources/features/05.TambahDivisi.feature",
        		"src/main/resources/features/06.ManagemenDivisi.feature",
        		"src/main/resources/features/07.ParameterShifting.feature",
        		"src/main/resources/features/08.KerjaPenempatan.feature",
        		"src/main/resources/features/09.MasterPosition.feature",
        		"src/main/resources/features/10.AbsenMasuk.feature",
        		"src/main/resources/features/11.AbsenPulang.feature",
        		"src/main/resources/features/12.AbsenIzin.feature",
        		"src/main/resources/features/13.AbsenSakit.feature"
        		},
        glue = "com.juaracoding.cucumber.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
