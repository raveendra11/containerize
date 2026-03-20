FROM php:8.0-fpm
RUN apt-get update && apt-get install -y libzip-dev && docker-php-ext-install zip
WORKDIR /var/www/html
COPY --from=composer:latest /usr/bin/composer /usr/bin/composer
COPY composer.json composer.lock ./
RUN composer install --no-dev --no-scripts

COPY . .
EXPOSE 9000
RUN useradd -ms /bin/ appuser
USER appuser
CMD ["php-fpm"]