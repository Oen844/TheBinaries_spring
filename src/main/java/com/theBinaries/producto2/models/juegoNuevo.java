package com.theBinaries.producto2.models;



    public class juegoNuevo {
        public String users;
        public String palabra1;
        public String palabra2;
        public String palabra3;
        public String palabra4;
        public String palabra5;

        public juegoNuevo() {

        }

        public juegoNuevo(String user, String word1, String word2, String word3, String word4, String word5) {
            this.users = user;
            this.palabra1 = palabra1;
            this.palabra2 = palabra2;
            this.palabra3 = palabra3;
            this.palabra4 = palabra4;
            this.palabra5 = palabra5;
        }

        public String getUser() {
            return users;
        }
        public void setUser(String user) {
            this.users = users;
        }
        public String getWord1() {
            return palabra1;
        }
        public void setWord1(String word1) {
            this.palabra1 = word1;
        }
        public String getWord2() {
            return palabra2;
        }
        public void setWord2(String word2) {
            this.palabra2 = word2;
        }
        public String getWord3() {
            return palabra3;
        }
        public void setWord3(String word3) {
            this.palabra3 = word3;
        }
        public String getWord4() {
            return palabra4;
        }
        public void setWord4(String word4) {
            this.palabra4 = word4;
        }
        public String getWord5() {
            return palabra5;
        }
        public void setWord5(String word5) {
            this.palabra5 = word5;
        }

    }

