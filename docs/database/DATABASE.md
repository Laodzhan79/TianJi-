# TianJi Data Model

Версия: v0.0.1 (Heartbeat)

---

# Общая схема

```
Source
   │
   ▼
RawData
   │
   ▼
Signal
   │
   ▼
Analysis
   │
   ▼
Opportunity
   │
   ▼
Recommendation
   │
   ▼
Action
```

---

# Сущности

## Source

Источник информации.

### Поля

- id
- name
- type
- url
- enabled

---

## RawData

Необработанные данные, полученные из источника.

### Поля

- id
- sourceId
- timestamp
- payload

---

## Signal

Обработанное событие.

### Поля

- id
- rawDataId
- category
- title
- description
- importance
- confidence
- created

---

## Analysis

Результат анализа группы сигналов.

### Поля

- id
- title
- summary
- probability
- created

---

## Opportunity

Потенциальная возможность.

### Поля

- id
- analysisId
- name
- description
- risk
- expectedProfit
- priority

---

## Recommendation

Рекомендация пользователю.

### Поля

- id
- opportunityId
- text
- confidence
- created

---

## Action

Действие пользователя.

### Поля

- id
- recommendationId
- action
- created

---

## Module

Подключаемый модуль.

### Поля

- id
- name
- version
- author
- enabled

---

## User

Настройки пользователя.

### Поля

- id
- name
- language
- riskProfile

---

# Принципы

- Каждая сущность имеет уникальный идентификатор.
- Все даты хранятся в UTC.
- Сущности связаны только через идентификаторы.
- История изменений не удаляется.
- Все данные должны быть воспроизводимы.

---

Версия модели:

v0.0.1
