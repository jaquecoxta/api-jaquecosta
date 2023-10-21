# Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

- Projeto para conclusão do curso Backend Java pelo Bootcamp Santander

## Diagrama de Classes

``` sereia
diagrama de classe
  classe Usuário {
    -nome: String
    -conta: conta
    -features: Lista<Recurso>
    -cartão: Cartão
    -notícias: Lista<Notícias>
  }
  
  classe Conta {
    -número: String
    -agência: String
    -equilíbrio: flutuante
    -limite: flutuante
  }
  
  recurso de classe {
    -ícone: String
    -descrição: String
  }
  
  cartão de classe {
    -número: String
    -limite: flutuante
  }
  
  classe Notícias {
    -ícone: String
    -descrição: String
  }
  Usuário --> Conta
  Usuário -> Recurso
  Usuário --> Cartão
  Usuário -> Notícias
```
