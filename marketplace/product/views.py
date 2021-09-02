from django.shortcuts import render
from rest_framework.decorators import action
from rest_framework.viewsets import ModelViewSet
from rest_framework.response import Response
from product.models import Product
from product.serializers import ProductSerializer

# Create your views here.
import json


class ProductViewSet(ModelViewSet):

    queryset = Product.objects.all()
    serializer_class = ProductSerializer

    def update(self, request, *args, **kwargs):
        data_to_change = {'id': request.data.get("id")}
        # Partial update of the data
        serializer = self.serializer_class(
            request.user, data=data_to_change, partial=True)
        if serializer.is_valid():
            self.perform_update(serializer)

        return Response(serializer.data)
