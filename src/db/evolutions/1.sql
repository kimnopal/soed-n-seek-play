# Update User

# --- !Ups

INSERT INTO
    user (
        user_type,
        id,
        email,
        nama,
        password,
        username,
        no_staff
    )
VALUES (
        "admin",
        1,
        "naufal@gmail.com",
        "naufal",
        "123",
        "naufal",
        0
    );

UPDATE hibernate_sequence SET next_val = 2;

# --- !Downs

DELETE FROM user WHERE username = "naufal";

UPDATE hibernate_sequence SET next_val = 1;