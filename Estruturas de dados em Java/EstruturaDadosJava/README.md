**Teste de Mesa Exercicio78Lista:**

1. **Inicialização:**

   - `nomes`: Lista vazia
   - `scanner`: Inicializado para a entrada padrão

2. **Leitura dos Nomes (Loop For):**

   | Iteração | Nome Lido | Estado de `nomes`                                            |
   | -------- | --------- | ------------------------------------------------------------ |
   | 1        | Ana       | ["Ana"]                                                      |
   | 2        | Carlos    | ["Ana", "Carlos"]                                            |
   | 3        | João      | ["Ana", "Carlos", "João"]                                    |
   | 4        | Maria     | ["Ana", "Carlos", "João", "Maria"]                           |
   | 5        | Pedro     | ["Ana", "Carlos", "João", "Maria", "Pedro"]                  |
   | 6        | Sofia     | ["Ana", "Carlos", "João", "Maria", "Pedro", "Sofia"]         |
   | 7        | Lucas     | ["Ana", "Carlos", "João", "Maria", "Pedro", "Sofia", "Lucas"] |
   | 8        | Julia     | ["Ana", "Carlos", "João", "Maria", "Pedro", "Sofia", "Lucas", "Julia"] |
   | 9        | Marcos    | ["Ana", "Carlos", "João", "Maria", "Pedro", "Sofia", "Lucas", "Julia", "Marcos"] |
   | 10       | Isabella  | ["Ana", "Carlos", "João", "Maria", "Pedro", "Sofia", "Lucas", "Julia", "Marcos", "Isabella"] |

3. **Leitura do Nome a Ser Procurado:**

   - Vamos supor que o nome fornecido seja "Sofia".

4. **Verificação do Nome:**

   - O programa usa o método `contains` da lista `nomes` para verificar se "Sofia" está presente na lista. Neste caso, está presente.

5. **Saída:**

   - Como o nome "Sofia" está presente na lista, o programa imprime "ACHEI".

**Teste de Mesa Exercicio78Lista:**

1. **Inicialização:**

   - `nomes`: Vetor de strings vazio com tamanho 10
   - `scanner`: Inicializado para a entrada padrão

2. **Leitura dos Nomes (Loop For):**

   | Iteração | Nome Lido | Estado de `nomes`                                            |
   | -------- | --------- | ------------------------------------------------------------ |
   | 1        | Ana       | ["Ana", null, null, null, null, null, null, null, null, null] |
   | 2        | Carlos    | ["Ana", "Carlos", null, null, null, null, null, null, null, null] |
   | 3        | João      | ["Ana", "Carlos", "João", null, null, null, null, null, null, null] |
   | 4        | Maria     | ["Ana", "Carlos", "João", "Maria", null, null, null, null, null, null] |
   | 5        | Pedro     | ["Ana", "Carlos", "João", "Maria", "Pedro", null, null, null, null, null] |
   | 6        | Sofia     | ["Ana", "Carlos", "João", "Maria", "Pedro", "Sofia", null, null, null, null] |
   | 7        | Lucas     | ["Ana", "Carlos", "João", "Maria", "Pedro", "Sofia", "Lucas", null, null, null] |
   | 8        | Julia     | ["Ana", "Carlos", "João", "Maria", "Pedro", "Sofia", "Lucas", "Julia", null, null] |
   | 9        | Marcos    | ["Ana", "Carlos", "João", "Maria", "Pedro", "Sofia", "Lucas", "Julia", "Marcos", null] |
   | 10       | Isabella  | ["Ana", "Carlos", "João", "Maria", "Pedro", "Sofia", "Lucas", "Julia", "Marcos", "Isabella"] |

3. **Leitura do Nome a Ser Procurado:**

   - Vamos supor que o nome fornecido seja "Sofia".

4. **Verificação do Nome:**

   - O programa entra em um loop que percorre o vetor `nomes`.
   - Verifica se cada elemento é igual ao nome "Sofia" (ignorando maiúsculas/minúsculas). Na iteração 6, o nome é encontrado.
   - A variável `encontrado` é definida como `true` e o loop é interrompido.

5. **Saída:**

   - Como o nome "Sofia" foi encontrado no vetor `nomes`, o programa imprime "ACHEI".



**Teste de Mesa Exercicio79Array:**

1. **Inicialização:**

   - `notas`: Array vazio de tamanho 20
   - `scanner`: Inicializado para a entrada padrão
   - `somaNotas`: Inicializado com 0
   - `mediaTurma`: Inicializado com 0
   - `alunosAcimaDaMedia`: Inicializado com 0

2. **Leitura das Notas dos Alunos (Loop For):**

   | Iteração | Nota Lida | `somaNotas` | Estado de `notas`                                            |
   | -------- | --------- | ----------- | ------------------------------------------------------------ |
   | 1        | 7.5       | 7.5         | [7.5, 0.0, ..., 0.0]                                         |
   | 2        | 6.8       | 14.3        | [7.5, 6.8, ..., 0.0]                                         |
   | 3        | 8.0       | 22.3        | [7.5, 6.8, 8.0, ..., 0.0]                                    |
   | 4        | 5.9       | 28.2        | [7.5, 6.8, 8.0, 5.9, ..., 0.0]                               |
   | 5        | 9.5       | 37.7        | [7.5, 6.8, 8.0, 5.9, 9.5, ..., 0.0]                          |
   | 6        | 7.2       | 44.9        | [7.5, 6.8, 8.0, 5.9, 9.5, 7.2, ..., 0.0]                     |
   | 7        | 6.3       | 51.2        | [7.5, 6.8, 8.0, 5.9, 9.5, 7.2, 6.3, ..., 0.0]                |
   | 8        | 8.7       | 59.9        | [7.5, 6.8, 8.0, 5.9, 9.5, 7.2, 6.3, 8.7, ..., 0.0]           |
   | 9        | 7.8       | 67.7        | [7.5, 6.8, 8.0, 5.9, 9.5, 7.2, 6.3, 8.7, 7.8, ..., 0.0]      |
   | 10       | 8.9       | 76.6        | [7.5, 6.8, 8.0, 5.9, 9.5, 7.2, 6.3, 8.7, 7.8, 8.9, ..., 0.0] |

3. **Cálculo da Média da Turma:**

   - `somaNotas` é a soma de todas as notas (76.6).
   - Média da turma = `somaNotas / 20` = `76.6 / 20` = 3.83

4. **Contagem de Alunos com Nota Acima da Média:**

   - `alunosAcimaDaMedia` é a contagem de notas acima da média.
   - Iteramos pelas notas e contamos as notas maiores que a média.
   - Resultado: `alunosAcimaDaMedia` = 10

5. **Saída de Dados:**

   - Exibição da média da turma: "Média da turma: 3.83"
   - Exibição do número de alunos com nota acima da média: "Número de alunos com nota acima da média: 10"



**Teste de Mesa Exercicio79Lista:**

1. **Inicialização:**

   - `notas`: Lista vazia para armazenar as notas dos alunos
   - `scanner`: Inicializado para a entrada padrão
   - `somaNotas`: Inicializado com 0
   - `mediaTurma`: Inicializado com 0
   - `alunosAcimaDaMedia`: Inicializado com 0

2. **Leitura das Notas dos Alunos (Loop For):**

   | Iteração | Nota Lida | `somaNotas` | Estado de `notas`                                  |
   | -------- | --------- | ----------- | -------------------------------------------------- |
   | 1        | 7.5       | 7.5         | [7.5]                                              |
   | 2        | 6.8       | 14.3        | [7.5, 6.8]                                         |
   | 3        | 8.0       | 22.3        | [7.5, 6.8, 8.0]                                    |
   | 4        | 5.9       | 28.2        | [7.5, 6.8, 8.0, 5.9]                               |
   | 5        | 9.5       | 37.7        | [7.5, 6.8, 8.0, 5.9, 9.5]                          |
   | 6        | 7.2       | 44.9        | [7.5, 6.8, 8.0, 5.9, 9.5, 7.2]                     |
   | 7        | 6.3       | 51.2        | [7.5, 6.8, 8.0, 5.9, 9.5, 7.2, 6.3]                |
   | 8        | 8.7       | 59.9        | [7.5, 6.8, 8.0, 5.9, 9.5, 7.2, 6.3, 8.7]           |
   | 9        | 7.8       | 67.7        | [7.5, 6.8, 8.0, 5.9, 9.5, 7.2, 6.3, 8.7, 7.8]      |
   | 10       | 8.9       | 76.6        | [7.5, 6.8, 8.0, 5.9, 9.5, 7.2, 6.3, 8.7, 7.8, 8.9] |
   | ...      | ...       | ...         | ...                                                |

3. **Cálculo da Média da Turma:**

   - `somaNotas` é a soma de todas as notas (76.6).
   - Média da turma = `somaNotas / quantidade de notas na lista` = `76.6 / 20` = 3.83

4. **Contagem de Alunos com Nota Acima da Média:**

   - `alunosAcimaDaMedia` é a contagem de notas acima da média.
   - Iteramos pelas notas e contamos as notas maiores que a média.
   - Resultado: `alunosAcimaDaMedia` = 10

5. **Saída de Dados:**

   - Exibição da média da turma: "Média da turma: 3.83"
   - Exibição do número de alunos com nota acima da média: "Número de alunos com nota acima da média: 10"

**Teste de Mesa Exercicio80Lista:**

1. **Inicialização:**

   - `Q`: Lista vazia para armazenar números positivos.
   - `scanner`: Inicializado para a entrada padrão.
   - `maiorElemento`: Inicializado com 0 (primeiro elemento a ser lido será maior ou igual a zero).
   - `posicaoMaior`: Inicializado com 0.

2. **Leitura dos Números Positivos (Loop For):**

   | Iteração | Número Lido | Estado de `Q`                                                |
   | -------- | ----------- | ------------------------------------------------------------ |
   | 1        | 5.0         | [5.0]                                                        |
   | 2        | 7.2         | [5.0, 7.2]                                                   |
   | 3        | 3.5         | [5.0, 7.2, 3.5]                                              |
   | 4        | 9.8         | [5.0, 7.2, 3.5, 9.8]                                         |
   | 5        | 2.5         | [5.0, 7.2, 3.5, 9.8, 2.5]                                    |
   | 6        | 6.0         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0]                               |
   | 7        | 8.7         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7]                          |
   | 8        | 4.1         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1]                     |
   | 9        | 5.5         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5]                |
   | 10       | 7.9         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9]           |
   | 11       | 6.3         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9, 6.3]      |
   | 12       | 0.8         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9, 6.3, 0.8] |
   | 13       | 1.2         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9, 6.3, 0.8, 1.2] |
   | 14       | 4.9         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9, 6.3, 0.8, 1.2, 4.9] |
   | 15       | 8.3         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9, 6.3, 0.8, 1.2, 4.9, 8.3] |
   | 16       | 2.0         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9, 6.3, 0.8, 1.2, 4.9, 8.3, 2.0] |
   | 17       | 9.0         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9, 6.3, 0.8, 1.2, 4.9, 8.3, 2.0, 9.0] |
   | 18       | 6.8         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9, 6.3, 0.8, 1.2, 4.9, 8.3, 2.0, 9.0, 6.8] |
   | 19       | 3.7         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9, 6.3, 0.8, 1.2, 4.9, 8.3, 2.0, 9.0, 6.8, 3.7] |
   | 20       | 7.6         | [5.0, 7.2, 3.5, 9.8, 2.5, 6.0, 8.7, 4.1, 5.5, 7.9, 6.3, 0.8, 1.2, 4.9, 8.3, 2.0, 9.0, 6.8, 3.7, 7.6] |

3. **Encontra o Maior Elemento e sua Posição (Loop For):**

   - Iteramos pela lista `Q` para encontrar o maior elemento e sua posição.

   | Iteração | Elemento Atual | `maiorElemento` | `posicaoMaior` |
   | -------- | -------------- | --------------- | -------------- |
   | 1        | 5.0            | 5.0             | 0              |
   | 2        | 7.2            | 7.2             | 1              |
   | 3        | 3.5            | 7.2             | 1              |
   | 4        | 9.8            | 9.8             | 3              |
   | 5        | 2.5            | 9.8             | 3              |
   | 6        | 6.0            | 9.8             | 3              |
   | 7        | 8.7            | 9.8             | 3              |
   | 8        | 4.1            | 9.8             | 3              |
   | 9        | 5.5            | 9.8             | 3              |
   | 10       | 7.9            | 9.8             | 3              |
   | 11       | 6.3            | 9.8             | 3              |
   | 12       | 0.8            | 9.8             | 3              |
   | 13       | 1.2            | 9.8             | 3              |
   | 14       | 4.9            | 9.8             | 3              |
   | 15       | 8.3            | 9.8             | 3              |
   | 16       | 2.0            | 9.8             | 3              |
   | 17       | 9.0            | 9.8             | 3              |
   | 18       | 6.8            | 9.8             | 3              |
   | 19       | 3.7            | 9.8             | 3              |
   | 20       | 7.6            | 9.8             | 3              |

4. **Saída de Dados:**

   - Exibição do maior elemento de `Q`: "Maior elemento de Q: 9.8"
   - Exibição da posição que ele ocupa no vetor: "Posição que ele ocupa no vetor: 4"

**Teste de Mesa Exercicio80Vetor:**



