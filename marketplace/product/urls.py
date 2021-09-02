from rest_framework import routers
from .views import ProductViewSet
from django.urls import path, include

router = routers.DefaultRouter()
router.register("product", ProductViewSet)

app_name = "api"

urlpatterns = [
    path('', include(router.urls))
]