-- --------------------------------------------------------
    -- SQL for sample database
    -- --------------------------------------------------------
    --

    -- Table structure
    --

CREATE TABLE posts(
    id INT(11) NOT NULL AUTO_INCREMENT,
    title VARCHAR(128) NOT NULL,
    content TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(id),
    KEY created_at(created_at)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
--

-- Sample data
--

CREATE TABLE categories(
    id INT(11) NOT NULL AUTO_INCREMENT,
    title VARCHAR(128) NOT NULL,
    PRIMARY KEY(id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8; 

CREATE TABLE categories_posts(
    idCategorie INT(11) NOT NULL,
    idPost INT(11) NOT NULL,
    PRIMARY KEY(idCategorie, idPost),
    CONSTRAINT Constr_posts_fk FOREIGN KEY(idPost) REFERENCES Posts(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT Constr_categories_fk FOREIGN KEY(idCategorie) REFERENCES Categories(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = utf8;


INSERT INTO posts(title, content)
VALUES(
    'First post',
    'This is a really interesting post.'
),(
    'Second post',
    'This is a fascinating post!'
),(
    'Third post',
    'This is a very informative post.'
);