/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_rh;

/**
 *
 * @author sandro00
 */
public class Cls_Ferias {
    private int matricula;
    private int dependentes;
    private double salarioBruto;
    private int tempoFerias = 30; 
    private double totalProventos;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public int getTempoFerias() {
        return tempoFerias;
    }

    public void setTempoFerias(int tempoFerias) {
        this.tempoFerias = tempoFerias;
    } 

    public double getTotalProventos() {
        return totalProventos;
    }

    public void setTotalProventos(double totalProventos) {
        this.totalProventos = totalProventos;
    }
 
    
    
}
