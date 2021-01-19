drop table if exists circuit_entity CASCADE;
create table circuit_entity (id bigint not null, length bigint, location varchar(255), name varchar(255), primary key (id));

insert into circuit_entity (id, name, length, location) values
 (1, 'Autodromo Nazionale Monza', 5793, 'Monza, Italy'),
 (2, 'Circuit de Monaco', 3337, 'Monte Carlo, Monaco'),
 (3, 'Silverstone Circuit', 5891, 'Silverstone, United Kingdom'),
 (4, 'Circuit de Spa-Francorchamps', 7004, 'Stavelot, Belgium'),
 (5, 'Nürburgring', 5148, 'Nürburg, Germany'),
 (6, 'Circuit Gilles Villeneuve', 4361, 'Montreal, Canada'),
 (7, 'Hockenheimring', 4574, 'Hockenheim, Germany'),
 (8, 'Interlagos Circuit', 4309, 'São Paulo, Brazil'),
 (9, 'Hungaroring', 4381, 'Mogyoród, Hungary'),
 (10, 'Red Bull Ring', 4318, 'Spielberg bei Knittelfeld, Austria'),
 (11, 'Suzuka Circuit', 5807, 'Suzuka, Japan'),
 (12, 'Circuit de Barcelona-Catalunya', 4655, 'Montmeló, Spain'),
 (13, 'Circuit Park Zandvoort', 4252, 'Zandvoort, Netherlands'),
 (14, 'Autodromo Internazionale Enzo e Dino Ferrari', 4909, 'Imola, Italy'),
 (15, 'Albert Park Circuit', 5303, 'Melbourne, Australia'),
 (16, 'Autódromo Hermanos Rodríguez', 4304, 'Mexico City, Mexico'),
 (17, 'Autódromo Juan y Oscar Gálvez', 4259, 'Buenos Aires, Argentina'),
 (18, 'Kyalami Racing Circuit', 4200, 'Midrand, South Africa'),
 (19, 'Watkins Glen', 5430, 'Watkins Glen, United States'),
 (20, 'Indianapolis Motor Speedway', 4192, 'Speedway, United States');