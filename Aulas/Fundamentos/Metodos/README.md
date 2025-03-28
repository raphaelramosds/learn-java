# Metodos

## Como executar

Compile 

```
javac utils/ArrayHelper.java StaticRoutine.java
```

Execute

```
java StaticRoutine
```

**Observação.** A classe que possui o método main sempre  é listada por último no comando `javac`

## Teoria

Em Java não há uma palavra reservada para identificar funções. Uma função é identificada pelo tipo de dado que ela retorna, sua assinatura e parâmetros 

```
modificadores tipoRetornado assinatura (parametros) {
    // definição da função
}
```

### Exemplo

```
public static void main (String[] args) {}
```

O método estático `main` é público, com parâmetro do tipo coleção de String e retorna `void`