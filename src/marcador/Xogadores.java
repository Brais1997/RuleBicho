/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcador;

import java.util.Objects;

/**
 *
 * @author balva
 */
public class Xogadores {
  private String nome ;
  private String apelidos;
  private String alias;
  private int codXogador;
  //↑ É o cogido que ten no torneo o xogador
  private int dorsal;

    public Xogadores(String nome, String apelidos, String alias, int codXogador, int dorsal) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.alias = alias;
        this.codXogador = codXogador;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Xogadores{" + "nome=" + nome + ", apelidos=" + apelidos + ", alias=" + alias + ", codXogador=" + codXogador + ", dorsal=" + dorsal + '}';
    }


}
