CREATE TABLE duck
(
    id                  BIGINT AUTO_INCREMENT NOT NULL,
    duck_type           VARCHAR(31)           NULL,
    name                VARCHAR(255)          NULL,
    fly_behavior_type   VARCHAR(255)          NULL,
    quack_behavior_type VARCHAR(255)          NULL,
    CONSTRAINT pk_duck PRIMARY KEY (id)
);